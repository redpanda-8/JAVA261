package org.example;
import java.util.ArrayList;

public class Main {
    public static boolean validateTeacher(Teacher teacher, Student student) {
        for (String teacherSubject : teacher.getSubjects()) { //bus String pavadinimu teacherSubject (eina per: teacher.getSubjects kuri grazina)
            for (String studentSubject : student.getSubjects()) {
                if (teacherSubject.equalsIgnoreCase(studentSubject)) {
                    return true;
                }
            }
        }
        return false;
    }

    //statinis pagalbinis method kuris gali isvesti duomenu struktura - gaus ArrayLista kuris yra String tipo ir pavadinam ji "subjects"
    public static void printSubjects(ArrayList<String> subjects){
        System.out.println("Subjects list: ");
        for(String subject: subjects){
            System.out.println(subject);
        }
    }

    public static void main(String[] args) {
        Student studentOne = new Student(1,"Tomas","tom@mail.com", "student", "KITM", "HL");
        studentOne.addSubject("JAVA");
        studentOne.addSubject("English");

        printSubjects(studentOne.getSubjects()); //kadangi nepriklausomas nuo klases, galim iskart iskviesti
        studentOne.login();
        studentOne.showProfile();
        studentOne.logout();

        Teacher teacherOne = new Teacher(1,"Ieva","ieva@mail.lt","teacher","metodininkas");
        teacherOne.addShool("KITM");
        teacherOne.addShool("KTU");
        teacherOne.addSubject("JAVA");
        teacherOne.addSubject("Progamming");

        Teacher teacherTwo = new Teacher(2,"Karolis","kar@mail.lt","teacher","ekspertas");
        teacherOne.addShool("KITM");
        teacherOne.addShool("KTU");
        teacherOne.addSubject("PHP");
        teacherOne.addSubject("JS");
        /*
        *Sukurti method, kuris nustatytu, kuris mokytojas moko studentOne
         */
        System.out.println(validateTeacher(teacherOne, studentOne));
    }
}