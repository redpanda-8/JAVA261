//package org.example;
//
//import java.io.FileNotFoundException;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Scanner;
//import java.io.File;
//
//public class Main {
//    public static ArrayList<Student> students = new ArrayList<>();
//    public static void addStudent(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Kiek studentu norite ivesti? ");
//        int studentCount = sc.nextInt();
//        String firstName;
//        String lastName;
//        String email;
//        sc.nextLine(); //SUKURIA TUSCIA EILUTE
//        for(int i = 0; i <studentCount; i++){
//            int id = (int)(Math.random()*10);
//            System.out.println("Iveskite studento varda: ");
//            firstName = sc.nextLine();
//            System.out.println("Iveskite studento pavarde: ");
//            lastName = sc.nextLine();
//            System.out.println("Iveskite studento pasta: ");
//            email = sc.nextLine();
//            students.add(new Student(id, firstName, lastName, email));
////            students.add(sc.nextLine());
//        }
//    }
//    public static void printList(ArrayList<Student> data){
//        for(Object student : data){
//            System.out.println(student);
//        }
//    }
//    public static void saveToFile(ArrayList<Student> students){
//        try{
//            FileWriter writer = new FileWriter("students.txt");
//            for(Student s: students){
//                writer.write(s.toString() + "\n");
//            }
//            writer.close();
//            System.out.println("Duomenys issaugoti");
//
//        }catch (IOException e){
//            System.out.println("Klaida irasant faila" + e.getMessage());
//        }
//    }
//    public static void readFromFile(){
//        try{
//            Scanner sc = new Scanner(new File("studentsData.txt"));
//            while(sc.hasNextLine()){
//                String line = sc.nextLine();
//                String[] parts = line.split(",");
//                int id = Integer.parseInt(parts[0].trim());
//                String firstName = parts[1].trim();
//                String lastName = parts[2].trim();
//                String email = parts[3].trim();
//
//                students.add(new Student(id, firstName, lastName, email));
//            }
//            sc.close();
//            System.out.println("failas nuskaitytas sekmingai");
//        }catch (FileNotFoundException e){
//            System.out.println("Failas nerastas" +e.getMessage());
//        }
//    }
//
//    public static void main(String[] args) {
//        //addStudent();
//        readFromFile();
//        printList(students);
//        saveToFile(students);
//    }
//}
//// NEGERAS SITAS- VIRSUJ GERAS
////public class Main {
////    public ArrayList<String> students = new ArrayList<>(); //visiem pasiekiamas bendras
////
////        public static void addStudent(){
////            Scanner sc = new Scanner(System.in);
////            System.out.println("kiek studentu ivesk");
////            int studentCount = sc.nextInt();
////            String firstName;
////            String lastName;
////            String email;
////            int id = (int)(Math.random() * 10);
////            for(int i=0; i<studentCount; i++){
////
////                System.out.println("ivesk studento varda");
////
////                firstName = sc.nextLine();
////                sc.nextLine();
////                lastName = sc.nextLine();
////                email = sc.nextLine();
////                students.add(new Student(id, firstName, lastName, email));
////            }
////            public static void printList(ArrayList data){
////                for(Object student : data){
////                    System.out.println(student);
////                }
////            }
////            public static void main(String[]args){
////                addStudent();
////                printList(students);
////            }
//
//       //paprastas isvedimas
////        System.out.println("Ivesk varda ");
////        String firstName = sc.nextLine();
////        System.out.println("Ivesk amziu ");
////        int age = sc.nextInt();
////        System.out.println("Vardas "+firstName +" Amzius "+age);
//
//
//        //kad butu galima uzpildyti studentu vardus masyve - efektyviau
////        String[] students = new String[10];
////        Scanner sc = new Scanner(System.in);
////        for(int i=0; i<students.length; i++){
////            System.out.println("ivesk student varda");
////            students[i] = sc.nextLine();
////        }
////        System.out.println("Student sarasas");
////        for(String student : students){
////            System.out.println(student);
////        }
//        // Jeigu nezinom kiek vartotojas ives arba daugiau nei 10 - tada kuriam COLLECTION
////        ArrayList<String> students = new ArrayList<>();
////        Scanner sc = new Scanner(System.in);
////        for(int i=0; i<5; i++){ //i<students.size() +1
////            System.out.println("ivesk student varda");
////            students.add(sc.nextLine()); //pridedam
////        }
////        System.out.println("student sarasas");
////        for(String student: students){
////            System.out.println(student);
////        }
//        //kaip is list butu galima issivest su standart for:
////        for(int i=0; i< students.size(); i++){
////            System.out.println(students.get(i));
////        }
//        //susikrauti studentus ir juos susirasyti i failus:

package org.example;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Student> students = new ArrayList<>();
    public static void addStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kiek studentu norite ivesti? ");
        int studentCount = sc.nextInt();
        String firstName;
        String lastName;
        String email;
        sc.nextLine();
        for(int i = 0; i <studentCount; i++){
            int id = (int)(Math.random()*10);
            System.out.println("Iveskite studento varda: ");
            firstName = sc.nextLine();
            System.out.println("Iveskite studento pavarde: ");
            lastName = sc.nextLine();
            System.out.println("Iveskite studento pasta: ");
            email = sc.nextLine();
            students.add(new Student(id, firstName, lastName, email));
//            students.add(sc.nextLine());
        }

    }

    public static void printList(ArrayList<Student> data){
        for(Object student : data){
            System.out.println(student);
        }
    }


    public static void saveToFile(ArrayList <Student> students){
        try {
            FileWriter writer = new FileWriter("students.txt");
            for (Student s: students){
                writer.write(s.toString() + "\n");

            }
            writer.close();
            System.out.println("Duomenys issaugoti");

        }catch (IOException e){
            System.out.println("Klaida irasant faila: " + e.getMessage());
        }
    }

    public static void readFromFile(){
        try {
            Scanner sc = new Scanner(new File("studentsData.txt"));
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0].trim());
                String  firstName = parts[1].trim();
                String lastName = parts[2].trim();
                String email = parts[3].trim();
                students.add(new Student(id, firstName, lastName, email));
            }
            sc.close();
            System.out.println("Failas nuskaitytas sekmingai");
        }catch (FileNotFoundException e){
            System.out.println("Failas nerastas" + e.getMessage());
        }
    }


    public static void main(String[] args) {

//       addStudent();
        readFromFile();
        printList(students);
        saveToFile(students);
    }
}
