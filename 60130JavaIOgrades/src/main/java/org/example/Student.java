package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private String surname;
    private List<Grade> grades;

    public Student(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        grades = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public double calculateAverage() {
        int sum = 0;
        for(Grade g: grades){
            sum += g.getValue();
        }
        return (double) sum / grades.size();
    }

    public String getResult() {
        return name + ", " + String.format("%.1f", calculateAverage());
    }

    @Override
    public String toString() {
        return getResult();
    }
}