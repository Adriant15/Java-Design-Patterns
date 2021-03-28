/**
 * Decouple an abstraction from implementation so that the two can very independently
 *
 * Helps to make concrete class functionalities independent from the interface implementer class
 *
 * When to use:
 *
 * - Implementation must be switched or selected at run-time
 *
 * - Changes in implementation of an abstraction should have no impact on clients
 *
 * - Hide implementation of an abstraction from clients
 *
 * - Have many implementation classes
 *
 * Adapter vs Bridges:
 *
 * - Adapter make unrelated classes work together, usually applies to systems after they have been designed
 *
 * - Bridge is used up-front
 *
 * Example:
 *
 * - In this example, the color classes and shape classes are decoupled. They can be changed independently without
 *   impacting each other.
 *
 * -
 */

package Structural_Design_Bridge;

public class Client {
    public static void main(String[] args){
        System.out.println("*****BRIDGE PATTERN*****");

        //Coloring Green to Triangle
        System.out.println("\nColoring Triangle:");
        ColorInterface green = new GreenColor();
        Shape triangleShape = new Triangle(green);
        triangleShape.drawShape(20);
        triangleShape.modifyBorder(20, 3);

        System.out.println("\n\nColoring Triangle:");
        ColorInterface red = new RedColor();
        Shape rectangleShape = new Triangle(red);
        triangleShape.drawShape(50);
        triangleShape.modifyBorder(50, 2);


    }

}
