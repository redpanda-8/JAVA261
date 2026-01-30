package org.example;

public class Main {
    // GERA PRAKTIKA
    public static void main(String[] args){
        //Test constructor and toString()
        Employee e1 = new Employee(8, "Peter","Pan",2500);
        System.out.println(e1); //toString();

        //Test Setters and Getters
        e1.setSalary(999);
        System.out.println(e1); //toString();
        System.out.println("id is: " + e1.getId());
        System.out.println("firstName is: " + e1.getFirstName());
        System.out.println("lastName is: " +e1.getLastName());
        System.out.println("salary is: " + e1.getSalary());

        System.out.println("name is: "+ e1.getName());
        System.out.println("annual salary is: "+ e1.getAnnualSalary()); //Test methd
        //Test raiseSalary()
        System.out.println(e1.raiseSalary(10));
        System.out.println(e1);
    }
}