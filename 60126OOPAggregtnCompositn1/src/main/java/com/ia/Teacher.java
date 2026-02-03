package com.ia;
//ASSOCIATION PVZ - SU student,teacher,main

import java.util.ArrayList;

public class Teacher {
    private String name;
    //has rysys - mokytojs turi students-ArrayListe saugo<priima student tipo objects>=suded i kolekc
    private ArrayList<Student> students = new ArrayList<>();

    //constructor
    public Teacher(String name){
        this.name=name;
    }
    //method kuris leidzia Teacher prideti i List studentus
    public void addStudent(Student stud){
        students.add(stud);
    }
    //method kuris leis isvesti visus studentus
    public void listStudents(){
        System.out.println("Student list:");
        //kiekvienam cikle student priskirsim student tipo objektui : einam per students kolekcija
        for(Student student: students){
            System.out.println(" - " +student.getName());
        }
    }
    @Override
    public String toString(){
        return "Vardas" +name;
    }
}
