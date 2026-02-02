package org.example;

import java.security.PublicKey;
// kad sukurtam objektui pakeisti savybes ne per methodus
public class Student {
    //public int id; //BLOGA PRAKTIKA - veliau sukurus objecta - galima perrasyti jo savybes - TO NEGALIMA LEISTI
    //public String firstName; //BLOGA PRAKTIKA
    // public String toString(){ //COMPILERIS PAMATES TOSTRING METHODA - KAI ISVEDINEJAM OBJECTA-ISVES INFO APIE JI
    // return "First name:" +firstname}

    // PRIVATE - ENCAPSULIACIJA - GERA PRAKTIKA (informacijos slepimas)
    //busimo objecto properciai - private nuo protective skirtums kad protec gali paveldet classe
    private int id;
    private String firstName;//GERA PRAKTIKA
    private String lastName;
    private String email;
    private String role; //dbr i konstruktoriu neimu,veliau pridesiu, kai atsiras role, ir neleidz nustat is isores

    //KONSTRUKTORIUS - PROPERTY PRISKIRIMAS - cia yra PARAMETRAI kuriuos paduosim i konstruktorius
    //construtoriau pavadinimas(Student) visada kaip klases pavadinimas
    public Student(int id, String firstName, String lastName, String email){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
    }

    // ACCESSORS AND MUTATORS - MUTE TABLES - LEIDZIA GAUTI INFO
    // GETTER AND SETTER - GAUTI IR NUSTATYTI NAUJA INFO
    // GERA IDEJA PER METODUS - NES MES TAI KONTROLIUOJAM
    // ID KEITIMAS NERA PROTINGA
    public void setFirstName(String firstName){ //SETTER
        this.firstName = firstName;
    }
    public void setLastName(String lastName){ //SETTER
        this.lastName = lastName;
    }
    public void setEmail(String email){ //SETTER
        this.email = email;
    }
    public String getFirstName(){ //GETTER
        return firstName;
    }
    public String getEmail(){ //GETTER
        return email;
    }
    public String getLastName(){ //GETTER
        return lastName;
    }
    //su virsuje blogais pavyzdziais: public String firstName
    public String toString(){ // PAPILDOM JAU EGZISTUOJANCIO METHOD - PERRASOM JO RETURN'A
        return "First name: " +firstName+".Last name:"+lastName+
                ".Email"+email; //grazinam stringa
    }
}