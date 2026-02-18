package org.example;

import java.util.ArrayList;

public class Student extends User {
    private String shool;
    private String level;
    private ArrayList<String> subjects = new ArrayList<>();

    //konstruktorius iskviestas is User ir papildytas studento params
    public Student(int id, String name, String email, String role, String shool, String level) {
        super(id, name, email, role); //iskvieciu konstruktoriu user klaseje
        this.shool=shool;
        this.level=level; //pridedu tik tuos kuriu truksta is student
    }

    @Override
    public void login() {
        System.out.println("prisijungete" + name + " .Jusu role:" +role);
    }

    @Override
    public void logout() {
        System.out.println("atsijungete");
    }

    //method kuris gali prideti subject'a studentui
    public void addSubject(String subject){
        this.subjects.add(subject);
    }

    public ArrayList<String> getSubjects(){
        return subjects;
    }

    @Override
    public String showProfile() {
        return """
               Profilio info: vardas""" +name+ """
               Role: """ +role;
    }
}