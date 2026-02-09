//Shape s1 = new Circle(5.5, "red", false);   -   objektas yra Circle bet laikomas Shape tipo kintamajame
//leidzia polymorphism - System.out.println(s1.getArea()); - koks tikras objektas? Circle > kviecia Circle.getArea()
//negalima s1.getRadius(); > nes Shape klaseje tokio metodo nera
//Circle c1 = (Circle) s1; + System.out.println(c1.getRadius()); - aš zinau, kad Shape s1 is tikro yra Circle
//Shape s2 = new Shape(); - klaida, nes Shape yra abstract klase - tik sablonas, o NE objektas

//Shape s4 = new Square(6.6); | Rectangle r2 = (Rectangle) s4; | Square sq1 = (Square) r2; - Square paveldi Rectangle tdl downcast galima per teva
package org.example;

public class Main {
    public static void main(String[] args) {
        // ======================= Circle(upcast + downcast)
        Shape s1 = new Circle(5.5, "red", false);   //upcast Circle > Shape

        System.out.println(s1);                    //which toString? > Circle.toString()
        System.out.println(s1.getArea());          //Circle.getArea()
        System.out.println(s1.getPerimeter());     //Circle.getPerimeter()
        System.out.println(s1.getColor());         //Shape.getColor()
        System.out.println(s1.isFilled());         //Shape.isFilled()

        // System.out.println(s1.getRadius());     //negalima: Shape neturi getRadius()

        Circle c1 = (Circle) s1;                   //downcast Shape > Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());        //dabar galima

        // ======================= Shape (negali sukurti, nes abstract)
        // Shape s2 = new Shape();                 //negalima - Shape yra abstract

        // ======================= Rectangle (upcast + downcast)
        Shape s3 = new Rectangle(1.0, 2.0, "red", false); //upcast Rectangle > Shape
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());

        // System.out.println(s3.getLength());     //negalima - Shape neturi getLength()

        Rectangle r1 = (Rectangle) s3;             //downcast Shape > Rectangle
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());        //dabar galima


        // ======================= Square (upcast + downcast per Rectangle
        Shape s4 = new Square(6.6);                //upcast Square > Shape
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());

        // System.out.println(s4.getSide());       //negalima - Shape neturi getSide()

        // Downcast Shape s4 > Rectangle (nes Square extends Rectangle)
        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        System.out.println(((Square) r2).getSide()); //jei nori getSide - turi cast'int i Square
        System.out.println(r2.getLength());          //Rectangle metods

        // Downcast Rectangle r2 -> Square
        Square sq1 = (Square) r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());       //paveldeta is Rectangle
    }
}