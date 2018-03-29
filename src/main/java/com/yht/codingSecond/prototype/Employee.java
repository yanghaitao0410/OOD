package com.yht.codingSecond.prototype;

public class Employee implements Cloneable{
    private int age;
    private String name;
    private Company company;

    public Employee(int age, String name, Company company) {
        this.age = age;
        this.name = name;
        this.company = company;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee e = (Employee) super.clone();
        e.company = (Company) company.clone();
        return e;
    }

    public static void main(String[] args) throws Exception{
        Company company = new Company("shenzhen");

        Employee employee1 = new Employee(20, "lisa", company);
        Employee employee2 = (Employee) employee1.clone();
        System.out.println(employee1.company);
        System.out.println(employee2.company);
        System.out.println(employee1 == employee2);
    }

}
