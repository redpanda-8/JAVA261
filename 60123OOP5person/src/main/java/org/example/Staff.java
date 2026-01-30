package org.example;

public class Staff extends Person{
    private String school;
    private double pay;

    public Staff(String name, String address, double pay, String school) {
        super(name, address);
        this.pay = pay;
        this.school = school;
    }
    public String getSchool() { return school;}
    public void setSchool(String school) {
        this.school = school;
    }
    public double getPay() { return pay;}
    public void setPay(double pay) { this.pay = pay;}

    @Override
    public String toString() {
        return "Staff - " + super.toString() +
                "school= " + school + '\'' +
                ", pay=" + pay + ' ';
    }
}