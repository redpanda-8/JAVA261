package com.ia;

public class Author {
    private String name;
    private String email;
    //constructor
    public Author(String name, String email){
        this.name=name;
        this.email=email;
    }
    public String getName(){
        return name;
    }
    //nera setName()nes vardas nekinta
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }

    @Override
    public String toString() {
        return "Author [name=" +name+ "email=" +email+ "]";
    }
}
