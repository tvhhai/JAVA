package com.company.designpattern.structural.bridge;

public class BridgeDemo2 {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedCircle());
        Shape blueCircle = new Circle(new BlueCircle());
        Shape greenCircle = new Circle(new GreenCircle());
        Shape greenSquare = new Square(new GreenSquare());

        redCircle.draw();
        blueCircle.draw();
        greenCircle.draw();
        greenSquare.draw();
    }
}

// Abstraction
abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();

}

// Implementor
interface Color {
    void color();
}

// ConcreteImplementor
class RedCircle implements Color {

    @Override
    public void color() {
        System.out.println("RedCircle");
    }
}

// ConcreteImplementor
class BlueCircle implements Color {

    @Override
    public void color() {
        System.out.println("BlueCircle");
    }
}

class GreenCircle implements Color {

    @Override
    public void color() {
        System.out.println("GreenCircle");
    }
}

class GreenSquare implements Color {

    @Override
    public void color() {
        System.out.println("GreenSquare");
    }
}

// Refined Abstraction
class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    public void draw() {
        color.color();
    }
}

// Refined Abstraction
class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    public void draw() {
        color.color();
    }
}