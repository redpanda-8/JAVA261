package org.example;

public class Square extends Rectangle {
    public Square() { // RECTANGLE default konstruktor
        super();
    }
    public Square(double side) {
        super(side, side); // width=side, length=side
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    //GETTER
    public double getSide() {
        return width; // tas pats kaip length
    }
    //SETTER
    public void setSide(double side) {
        width = side;
        length = side;
    }

    @Override
    public void setWidth(double side) {
        setSide(side);
    }
    @Override
    public void setLength(double side) {
        setSide(side);
    }
    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}