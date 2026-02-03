package org.example;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Domas", "Kaunas");
        System.out.println(p);
        Student s = new Student("Ronas", "Kaunas", "Java", 2025, 100 );
        System.out.println(s); // kviecia Person.toString()
        Staff staf = new Staff("Tadas", "Vilnius", 500.00, "Kitm");
        System.out.println(staf);
    }
}