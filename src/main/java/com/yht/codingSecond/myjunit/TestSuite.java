package com.yht.codingSecond.myjunit;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

public class TestSuite implements Test {

    private List<Test> tests = new ArrayList<>();
    private String name;

    public TestSuite() {}

    public TestSuite(Class<?> theClass) {
        this.name = theClass.getName();
        Constructor<?> constructor = null;
        try {
            constructor = getConstructor(theClass);
        }catch (NoSuchMethodException e) {
            return;
        }

        List<String> names = new ArrayList<>();
        Method[] methods = theClass.getDeclaredMethods();
        for(Method method : methods) {
            addTestMethod(method, names, constructor);
        }

    }

    public void addTestMethod(Method method, List<String> names, Constructor<?> constructor) {
        String name = method.getName();
        if(names.contains(name)) {
            return;
        }
        if(isPublicTestMethod(method)) {
            names.add(name);

            Object[] args = new Object[] {name};
            try {
                addTest((Test) constructor.newInstance(args));
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }else if(isTestMethod(method)) {

        }


    }

    public boolean isPublicTestMethod(Method method) {
        return isTestMethod(method) && Modifier.isPublic(method.getModifiers());
    }

    private boolean isTestMethod(Method method) {
        Class<?> returnType = method.getReturnType();
        Parameter[] parameters = method.getParameters();
        return method.getName().startsWith("test") && returnType.equals(Void.TYPE) && parameters.length == 0;
    }

    public void addTest(Test test) {
        tests.add(test);
    }


    public Constructor<?> getConstructor(Class<?> testClass) throws NoSuchMethodException {
        //约定必须得有参数为String的构造函数
        Class<?>[] args = {String.class};
        Constructor<?> constructor = testClass.getDeclaredConstructor(args);
        return constructor;
    }

    @Override
    public int countTestCases() {
        return tests.size();
    }

    @Override
    public void run(TestResult testResult) {
        for(Test test : tests) {
            test.run(testResult);
        }
    }
}
