package org.example;

public class Employee {
    // PRIVATE - ENCAPSULIACIJA - GERA PRAKTIKA
    private int id;
    private String firstName;//GERA PRAKTIKA
    private String lastName;
    private int salary;

    //KONSTRUKTORIUS - PROPERTY PRISKIRIMAS
    public Employee(int id, String firstName, String lastName, int salary){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
    }
    // GETTERS
    public int getId(){ return id;}
    public String getFirstName(){ return firstName;}
    public String getLastName(){ return lastName;}
    // firstName + space + lastName
    public String getName(){ return firstName+" "+lastName;}
    public int getSalary(){ return salary;}

    // SETTER
    public void setSalary(int salary){ this.salary=salary;}
    public int getAnnualSalary(){ return salary*12;} // salary * 12

    // increate salary by percent +return new salary
    public int raiseSalary(int percent){
        salary = salary + (salary * percent / 100);
        return salary;}
    //toString
    public String toString() {
        return "Employee[" + "id=" + id +
                ", name='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ']';
    }
}
//    public String toString(){ return "First name: " +firstName+".Last name:"+lastName; }