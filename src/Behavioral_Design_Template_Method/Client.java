/**
 * Defines skeleton of an algorithm in an operation, deferring some steps to subclasses
 * - lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure
 *
 * Enables you to define the sequence of steps and then override those steps that need to change
 *
 * Software reuse is the fundamental goal of this method
 *
 * Great tool for creating frameworks (controls how something gets done)
 *
 * Leaves user of framework to specify their own details about what is actually happening at each step of the frame's
 * algorithm
 *
 * Factory method is a specialization of Template Method
 *
 * When to use:
 *
 * - when you need to support multiple algorithms that behave conceptually the same but have different implementation
 *   for each step
 *
 * - avoid code duplication. First find difference in existing code, separate difference into new operations and replace
 *   the differing code with template method that calls one of these new operations
 *
 *  - When you want to control at what points sub-classing is allowed
 *
 *  - When behavior of an algorithm can vary, you let subclasses implement the behavior throuhg overriding
 *
 *  Strategy vs Template Method:
 *
 *  - Strategy encapsulate algorithms by composition
 *
 *  - Template Method encapsulate algorithms by inheritance
 *
 * Example:
 *
 * - The template class contains abstract methods that subclasses will implement differently and final method that is
 *   common to all subclasses.
 *
 */

package Behavioral_Design_Template_Method;

public class Client {

    public static void main(String[] args) {
        OrderProcessTemplate netOrder = new NetOrder();
        netOrder.processOrder(true);

        System.out.println("------ We changed the template to a store order");

        OrderProcessTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder(true);
    }
}
