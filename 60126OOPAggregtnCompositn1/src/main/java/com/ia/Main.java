package com.ia;

//RYSIU TIPAI - tikslas-sukurti objects susijusius nuo kito object
// paveldejimas>klase priklausoma  |  is.a-yra dalis klases | has.a-kazka turi (negali veikti be kitos class)
// sukurti object>kviesti jo methoda>kuris prideda kitos klases object


// cold path refers to code paths executed infrequently, such as during system initialization, metadata refreshes, configuration changes,
// or infrequent error handling. Unlike the "hot path," which requires extreme optimization, cold path aggregation can afford higher
// latency in exchange for simpler, more consistent, or more robust concurrency handling

public class Main {
    public static void main(String[] args){
    // ASSOCIATION - uses-a (klaseje nuoroda i klase) - BENDRAS RYSYS-VIENS OBJECTS ZINO APIE KITA, GALI TURET NUORODAS
        // AGGREGATION - Has-A's - RYSYS NESISAVINA GYVAVIMO CIKLO - VIENS OBJECTS KONTEINERIS-KITS TO KONTEINERIO DALIS
        // COMPOSITION - STIPRUS RYSYS - VIENS OBJECTS PRIKLAUSO IR NEGALI GYVENT BE KITO - pats kontroliuoja object kurima

        Student s1=new Student("Tadas");
        Student s2=new Student("Domas");
        Student s3=new Student("Tomas");

        Teacher t1=new Teacher("Rimas");
        Teacher t2=new Teacher("Gedas");
        //mokytojs turi nuoroda i student - student ir mok gali gyvuoti nepriklausomai ASSOCIATION RYSYS
        t1.addStudent(s1);
        t1.addStudent(s2);
        t2.addStudent(s3);

        System.out.println("Pirmo mok studentai:");
        t1.listStudents();
        System.out.println("Antro mok studentai:");
        t2.listStudents();

        s3.setMentor(t1);
        System.out.println("s3 student mentorius:");
        System.out.println(s3.getMentor());

        Employee e1=new Employee("Petras");
        Employee e2=new Employee("Tedis");

        Departament d1=new Departament("IT");

        d1.addEmployee(e1);
        d1.addEmployee(e2);
        d1.printEmployees();

        House h1=new House("Tilto g1 Kaunas");
        House h2=new House("Laisves al.33 Kaunas");

        h1.addRoom("1A");
        //ARBA GALIMA SUKTI CIKLA
        for(int i=1; i<10; i++){ //pradedam cikla nuo 1 nes nulinis kambarys atrodo keistai
            h1.addRoom("Kambarys" +i +"C");
        }
        for(int i=1; i<5; i++){
            h2.addRoom("Kambarys" +i +"B");
        }
        System.out.println("H1 kambariai");
        h1.showRooms();
        System.out.println("H2 kambariai");
        h2.showRooms();
    }

}
