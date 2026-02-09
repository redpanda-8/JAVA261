package org.example;
//abstract superclass
public abstract class Shape {
    protected String color = "red";     // protected reiskia mato paveldetojai (Circle, Rectangle)
    protected boolean filled = true;

    public Shape() { // Default Konstruktors
    }
    //Konstruktors su parametrais
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    //GETTERS
    public String getColor() {
        return color;
    }
    public boolean isFilled() {
        return filled;
    }
    //SETTERS
    public void setColor(String color) {
        this.color = color;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    // Abstract methods(no body)
    public abstract double getArea(); //kiekviena klase kuri PAVELDI SHAPE - PRIVALO parasyti SAVO getArea()
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}