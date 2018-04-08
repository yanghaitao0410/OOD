package com.yht.codingSecond.myjunit;

import java.lang.reflect.Method;

public abstract class TestCase extends Assert implements Test {
    private String name;

    TestCase() {
        name = null;
    }

    public TestCase(String name) {
        this.name = name;
    }

    @Override
    public void run(TestResult testResult) {
        testResult.run(this);
    }


    public void doRun() {
        setUp();
        try {
            runTest();
        }catch (Throwable throwable) {
            throwable.printStackTrace();
        }finally {
            tearDown();
        }

    }

    protected void runTest() throws Throwable {
        Method runMethod = getClass().getMethod(name, null);
        runMethod.invoke(this, new Class[0]);
    }
    protected void setUp() {
    }






    protected void tearDown() {
    }

    @Override
    public int countTestCases() {
        return 0;
    }
}
