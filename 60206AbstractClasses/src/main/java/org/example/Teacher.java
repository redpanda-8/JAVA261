package org.example;

import java.util.ArrayList;

public class Teacher extends User{
    private ArrayList<String> shools = new ArrayList<>(); //kelios skirtingos mokyklos tdl arrayList
    private ArrayList<String> subjects = new ArrayList<>(); //keli skirt subjects
    private String level; //skirtingas mokytoju lygis
    //paveldetas User konstruktorius
    public Teacher(int id, String name, String email, String role, String level) {
        super(id, name, email, role);
        this.level=level;
    }

    @Override
    public void login() {
        System.out.println("prisijungete" + name + " .Jusu role:" +role);
    }

    @Override
    public void logout() {
        System.out.println("atsijungete");
    }

    //naujas methodas - prideda mokykla
    public void addShool(String shool){
        this.shools.add(shool);
    }
    //methodgrazins mokyklu - arrayLista, kad veliau butu galima lengviau rast kurio mokytojo kuris mokinys
    public ArrayList<String> shoolsList(){
        return shools;
    }
    //prideti dalyka kuri mokytojas moko
    public void addSubject(String subject){
        this.subjects.add(subject);
    }
    //grazinti subject'u arrayLista
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