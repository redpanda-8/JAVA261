package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        try {
            Scanner sc1 = new Scanner(new File("0130students.txt"));
            while (sc1.hasNext()) {
                int id = sc1.nextInt();
                String name = sc1.next();
                String surname = sc1.next();
                students.add(new Student(id, name, surname));
            }
            sc1.close();
            System.out.println("Studentu failas nuskaitytas sekmingai");
        } catch (IOException e) {
            System.out.println("Klaida nuskaitant faila " + e.getMessage());
        }

        try {
            Scanner sc2 = new Scanner(new File("0130grades.txt"));
            while (sc2.hasNextLine()) {
                String line = sc2.nextLine();
                String[] parts = line.split(" ");

                int studentId = Integer.parseInt(parts[0]);

                for (Student s : students) {
                    if (s.getId() == studentId) {
                        for (int i = 1; i < parts.length; i++) {
                            s.addGrade(new Grade(Integer.parseInt(parts[i])));
                        }
                    }
                }
            }
            sc2.close();
            System.out.println("Pazymiu failas nuskaitytas sekmingai");
        } catch (IOException e) {
            System.out.println("Klaida nuskaitant faila " + e.getMessage());
        }

        try {
            FileWriter writer = new FileWriter("0130results.txt");
            for (Student s : students) {
                writer.write(s.getResult() + "\n");
            }
            writer.close();
            System.out.println("Duomenys issaugoti");
        } catch (IOException e) {
            System.out.println("Klaida irasant faila: " + e.getMessage());
        }
    }
}