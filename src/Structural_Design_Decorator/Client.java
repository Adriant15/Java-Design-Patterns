/**
 * Allow you to attach additional responsibilities to an object dynamically
 * - add new functionality to existing object without altering its structure
 *
 * Flexible alternative to sub-classing
 * - can remove/add responsibilities by attaching/detaching decorators
 *
 * Main principle: cannot modify existing functionalities but we can extend them
 * - open for extension but closed for modification
 *
 * Add specific function to some specific object but not the entire class (at runtime)
 *
 * Drawback: large number of small classes can be overwhelming, lot of little objects can be hard to learn/debug
 *
 * When to use:
 *
 * - When extension by sub-classing is impractical (class may be hidden or unavailable for sub-classing)
 *
 * - To add responsibilities to individual objects dynamically without affecting other objects
 *
 * Example:
 *
 * - ShapeDecorator abstract class has instance of shape
 *
 * - Concrete decorator will override existing draw() of shape and add the additional function of setting a red border
 *
 * - The original shape class object is not modified and new function is added by using passing shape class into
 *   the decorator object and using it.
 *
 */

package Structural_Design_Decorator;

public class Client {
    public static void main(String[] args){
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangel());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle with red border");
        redCircle.draw();

        System.out.println("\nRectangle with red border");
        redRectangle.draw();
    }
}
