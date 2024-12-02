package ru.vsu.cs;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[]{
                new Rectangle(2.5, 4),
                new Circle(12.5),
                new Triangle(3, 4, 5)
        };

        for (Shape shape : shapes) {
            System.out.println(shape + " getArea: " + shape.getArea());
        }

    }
}