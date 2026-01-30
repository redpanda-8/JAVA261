package org.example;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Domas", "Kaunas");
        System.out.println(person);
        Student student = new Student("Ronas", "Kaunas", "Java", 2025, 100 );
        System.out.println(student);
        Staff staff = new Staff("Tadas", "Vilnius", 500.00, "Kitm");
        System.out.println(staff);
    }
}