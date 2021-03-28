package Structural_Design_Decorator;

public interface Shape {
    void draw();
}

class Rectangel implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}

class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}