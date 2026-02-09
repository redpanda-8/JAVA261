package org.example;

public class Rectangle extends Shape {

    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle() { // SHAPE default konstruktor
        super();
    }
    public Rectangle(double width, double length) {
        super();        // SHAPE default konstruktor
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);// SHAPE konstruktor
        this.width = width;
        this.length = length;
    }
    //GETTERS
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
    //SETTERS
    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }

    @Override // Override ABSTRACT metodus
    public double getArea() {
        return width * length;
    }
    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }
    @Override //CIRCLE nenori perrasyti visko nuo nulio tdl naudoja SHAPE super.toString
    public String toString() {
        return "Rectangle[" + super.toString() +
                ",width=" + width +
                ",length=" + length + "]";
    }
}