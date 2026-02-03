package com.ia;
// COMPOSITION PVZ - su Room.java - namas negali but be adreso ir kambariu

import java.util.ArrayList;

public class House {
    String address;

    private ArrayList<Room> rooms=new ArrayList<>();

    //constructor
    public House(String address){
        this.address=address;
    }

    public void addRoom(String roomName){
        rooms.add(new Room(roomName)); //CIA VIDUJE KURIAME OBJECT - KAMBARIO KURIMAS viduje = COMPOSITION-nereik Maine kurti Room
        //padavus kambario varda - jis ji sukurs cia
    }
    //kad galetume isvest kambarius
    public void showRooms(){
        System.out.println("Namo adresas:" +address +"ten kambariu:");
        for(Room r: rooms){
            System.out.println(" - " + r.getName());
        }
    }
}
