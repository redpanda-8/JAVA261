package org.example;

public class Main {
    //Java kai sukuriam klase-ji tampa nauju duomenu tipu
    //Klaseje reikia is JAVA paveldeti toString - tada bus galima isvesti informacija
    // BLOGA PRAKTIKA
//    public static void main(String[] args) {
        //INSTANCE SUKURIMAS(objectas sukurtas klases pagrindu/sablonas, ir priskirtos properties joViduje)
        //STUDENT - Duomenu tipas, studentOne - KINTAMASIS = jam priskirtas objectas = NEW OBJECT Student();
//        Student studentOne = new Student(); //INSTANCE - sukurtas tuscias objektas - jo negali isvesti nes neturi toString method
//            Student studentTwo = new Student(); //ANTRAS INSTANCE - antras objectas
    //        //mes nko nepriskyrem - method turi properties bet jos neturiu jokios reiksmes tdl isveda null, null
                // SUKURTAM TUSCIAM OBJECTUI - PRISKIRTOS PROPERTIES REIKSMES
//            System.out.println(studentTwo); //rodo id(objectas sukurtas), bet jo neisveda, nes object neturi strng method
//            ///BLOGA praktika - taip leisti objektui savybe po viena issivedineti-nes nk nekntroljam,o norim kontroliuoti per methods
//            studentTwo.firstName="Tomas";
//            studentTwo.lastName="Tomaitis";
//            System.out.println("StudentEmail:"+studentTwo.email);
//        }
//    }
    // GERA PRAKTIKA
    public static void main(String[] args){
        //sukuriam objekta, jam priskiriam new object Student ir duodam jam params(id,name,lastname,email)
        Student studentOne = new Student(1,"Tomas","Tomaitis","tom@mail.com");
        studentOne.setFirstName("Ieva"); //vardo keitimas - jau sukurtam object (pries tai buvo Tomas)
        System.out.println(studentOne); //kadangi viduje yra TOSTRING >taip galima isvesti informacija (Student.java ~52row)
    }
}