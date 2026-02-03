package com.ia;
//ASSOCIATION PVZ - SU student,teacher,main

public class Student {
    private String name;
    private Teacher mentor; //Teacher tipo - objectas

    //constructor
    public Student(String name){
        this.name=name;
    }
    //abipuse ASSOCIATION - kad veliau pridet mentor
    public void setMentor(Teacher mentor){
        this.mentor=mentor;
    }
    public String getName(){
        return name;
    }
    public Teacher getMentor(){
        return mentor;
    }
}
