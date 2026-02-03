package com.ia;
// COMPOSITION PVZ - su House.java - namas negali but be adreso ir kambariu
// room egzstavims tiesiogiai priklaus nuo house > nes house kuria objecta
public class Room {
    private String name;

    public Room(String name){
        this.name=name;
    }
    //method kuris grazina pavadinima
    public String getName(){
        return name;
    }
}
