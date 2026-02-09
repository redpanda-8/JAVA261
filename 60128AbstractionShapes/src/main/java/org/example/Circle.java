package org.example;

public class Circle extends Shape {

    protected double radius = 1.0;

    public Circle() {
        super(); // SHAPE default konstruktor
    }
    public Circle(double radius) {
        super(); // SHAPE default konstruktor
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled); // kvieciam SHAPE konstruktor
        this.radius = radius;
    }
    //GETTER
    public double getRadius() {
        return radius;
    }
    //SETTER
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override // Override ABSTRACT metodus
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override //CIRCLE nenori perrasyti visko nuo nulio tdl naudoja SHAPE super.toString
    public String toString() {
        return "Circle[" + super.toString() +
                ",radius=" + radius + "]";
    }
}