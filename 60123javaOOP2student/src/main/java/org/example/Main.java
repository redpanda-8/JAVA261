package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // BLOGA PRAKTIKA
//    public static void main(String[] args) {
        //INSTANCE SUKURIMAS(objectas sukurtas klases pagrindu)
        // studentOne - KINTAMASIS =jam priskirtas = NEW OBJECTAS Student();
//        Student studentOne = new Student();
//            Student studentTwo = new Student(); //second instance - kitas objectas
//            studentTwo.firstName="Tomas"; //BLOGA praktika
//            studentTwo.lastName="Tomaitis";
//            System.out.println(studentTwo); //rodo id(objectas sukurtas), bet jo neisveda, nes neturi strng method
//            System.out.println("StudentEmail:"+studentTwo.email);
//        }
//    }
    // GERA PRAKTIKA
    public static void main(String[] args){
        Student studentOne = new Student(1,"Tomas","Tomaitis","tom@mail.com");
        studentOne.setFirstName("Ieva");
        System.out.println(studentOne);
    }
}