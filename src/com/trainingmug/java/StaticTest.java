package com.trainingmug.java;

public class StaticTest {

    static  int count = 100; // class variable

    String name; // instance variable

    // static block
    static {
        System.out.println("Static block is invoked,");
    }

    static {
        System.out.println("Static block 2");
    }

    static void getCountDetails(){
        System.out.println("Count : " + count);
        //System.out.println("Name : " + name); // can't access since it is non-static data
    }

    void getName(){
        System.out.println("Name : " + name);
        System.out.println("Count : " + count);
    }

    public static void main(String[] args) {
        // Static Variable
        System.out.println("Company Name : " + Employee.COMPANY_NAME);

        /*
        Employee employee1 = new Employee();
        System.out.println("Company Name : " + employee1.companyName); // Not Recommended
        employee1.companyName = "TrainingMug Pvt Ltd";

        Employee employee2 = new Employee();
        System.out.println("Company Name : " + employee2.companyName); // Not Recommended

        System.out.println("Company Name : " + Employee.companyName);

         */

        // static method
        //Employee.companyInfo();

        /*
        Employee employee1 = new Employee();
        employee1.companyInfo(); // Not Recommended

         */

        /*
        1. if each instance should have its own properties , then create them as instance variables
        2. if each instance should have the same data, then create them as static variables
        3. if you want to access data, without creating an object, then create them as static variables
         */

        System.out.println("Count : " + count);
        getCountDetails();

        StaticTest st1 = new StaticTest();
        st1.getName();

        /*
        Rule 1
        1. Static members can access only static data
         */

        /*
        Rule 2
        1. Instance members can access both static and non-static data
         */
    }

    static {
        System.out.println("Static block 3");
    }
}
