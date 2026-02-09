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
////        for(int i=0; i<5; i++){ //ARBA i<students.size()
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
//        //susikrauti studentus ir juos susirasyti i failus (rankiniu budu surasyt))
package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
//scanner class - works with stream(srautas ateina i aplikacija)
public class Main {
    public static ArrayList<Student> students = new ArrayList<>(); //pasiekiamas visiem bendras //##
    public static void addStudent(){
        Scanner sc = new Scanner(System.in); //scanner object -KAI IVEDIMAS (system.in-reiskia vartotjs gales ivesti)
        System.out.println("Kiek studentu norite ivesti? ");
        //string firstName=sc.nextLine(); //pvz vardui
        //System.out.println("vardas:" +firstName);
        int studentCount = sc.nextInt();
        String firstName; //sukuriami kintamieji, kuriuos veliau FOR cikle perrasom
        String lastName;
        String email;
        sc.nextLine(); //SUKURIA TUSCIA EILUTE
        for(int i = 0; i <studentCount; i++){
            int id = (int)(Math.random()*10);
            System.out.println("Iveskite studento varda: ");
            firstName = sc.nextLine();
            System.out.println("Iveskite studento pavarde: ");
            lastName = sc.nextLine();
            System.out.println("Iveskite studento pasta: ");
            email = sc.nextLine();
            students.add(new Student(id, firstName, lastName, email));   //##public static ArrayList<Student> - nes cia idedam Student
//            students.add(sc.nextLine());
        }
    }
    public static void printList(ArrayList<Student> data){
        for(Object student : data){ //norim gaut Student kuris bus student : einam per data
            System.out.println(student);
        }
    }
    //SAVE>FILE (turi gaut arrayLista<kuris uzpildyts su Student> kokio tipo objects saugo students )
    public static void saveToFile(ArrayList <Student> students){
        try {
            FileWriter writer = new FileWriter("students.txt");
            for (Student s: students){ //irasom kiekvna student objecta,nesTurimKolekcija-pavadinam s ir einam per collection students
                writer.write(s.toString() + "\n"); //kvieciam writer 69eil.Jam kvieciam method write ir visiem s taiko toString is apacios
            }
            writer.close();
            System.out.println("Duomenys issaugoti");

        }catch (IOException e){
            System.out.println("Klaida irasant faila: " + e.getMessage());
        }
    }
    public static void readFromFile(){
        try {
            Scanner sc = new Scanner(new File("studentsData.txt")); //JAVA klase File
            while (sc.hasNextLine()){       //while - vykdyk kol yra eiluciu
                String line = sc.nextLine();
                String[] parts = line.split(","); //eilutes dalys atskirtos ,
                int id = Integer.parseInt(parts[0].trim()); //parts[0] -pradeda nuo pirmo | trim() -jei butu tarpu
                String  firstName = parts[1].trim();
                String lastName = parts[2].trim();
                String email = parts[3].trim();
                students.add(new Student(id, firstName, lastName, email));
            }
            sc.close(); //svarbu uzdaryti
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