package org.example;

import java.security.PublicKey;

public class Student {
    //public int id; //BLOGA PRAKTIKA - veliau sukurus objecta - galima perrasyti jo savybes - TO NEGALIMA LEISTI
    //public String firstName; //BLOGA PRAKTIKA
    // PRIVATE - ENCAPSULIACIJA - GERA PRAKTIKA
    private int id;
    private String firstName;//GERA PRAKTIKA
    private String lastName;
    private String email;
    private String role;

    //KONSTRUKTORIUS - PROPERTY PRISKIRIMAS
    public Student(int id, String firstName, String lastName, String email){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
    }

    // ACCESSORS AND NOTATONS - MUTE TABLES - LEIDZIA GAUTI INFO
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
    public String toString(){ // PERRRASYTAS JAU EGZISTUOJANCIO METHOD - PERRASOM JO RETURN'A
        return "First name: " +firstName+".Last name:"+lastName+
                ".Email"+email;
    }
}