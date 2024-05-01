package com.mycompany.interfacet;
interface Shape {
    float computeArea();
}

class Rectangle implements Shape {
    private float length;
    private float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float computeArea() {
        return length * width;
    }
}

class Circle implements Shape {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float computeArea() {
        return (float) (Math.PI * radius * radius);
    }
}

public class Interfacet {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(5);

        System.out.println("Area of Rectangle: " + rectangle.computeArea());
        System.out.println("Area of Circle: " + circle.computeArea());
    }
}


