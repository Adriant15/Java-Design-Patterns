package Structural_Design_Bridge;

public abstract class Shape {
    protected ColorInterface color;

    protected Shape (ColorInterface c){
        this.color = c;
    }

    abstract void drawShape(int border);
    abstract void modifyBorder(int border, int increment);
}

class Triangle extends Shape{
    protected Triangle(ColorInterface c){
        super(c);
    }

    //Implementer-specific method
    @Override
    void drawShape(int border) {
        System.out.println("This triangle is colored with ");
        color.fillWithColor(border);
    }

    //Abstraction-specific method
    @Override
    void modifyBorder(int border, int increment) {
        System.out.println("\nNow we are change the border length " + increment + " times");
        border = border * increment;
        drawShape(border);
    }
}

class Rectangle extends Shape{
    protected Rectangle(ColorInterface c){
        super(c);
    }

    //Implementer-specific method
    @Override
    void drawShape(int border) {
        System.out.println("This rectangle is colored with ");
        color.fillWithColor(border);
    }

    //Abstraction-specific method
    @Override
    void modifyBorder(int border, int increment) {
        System.out.println("\nNow we are change the border length " + increment + " times");
        border = border * increment;
        drawShape(border);
    }
}