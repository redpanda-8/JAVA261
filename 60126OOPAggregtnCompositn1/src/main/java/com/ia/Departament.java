package com.ia;
// AGGREGATION pvz (su EMPLOYEE.JAVA)

import java.util.ArrayList;

public class Departament {
    private String title;

    private ArrayList<Employee> employees = new ArrayList<>();
    //constructor
    public  Departament(String title){
        this.title=title;
    }
    //method kuris leidz add employee
    public void addEmployee(Employee e){
        employees.add(e);//employees kolekcija i kuria add'inam e
    }
    public void removeEmployee(Employee e){
        employees.remove(e);
    }
    public void printEmployees(){
        System.out.println("Departamente:" +title +"dirba sitie");
        for(Employee e: employees){ //kiekviena karta kai sukursime employee object>sukam cikla
            System.out.println(" - " +e.getName());
        }
    }
}
