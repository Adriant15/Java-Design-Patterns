/**
 * Defines a family of algorithms, encapsulates each one, and make them interchangeable
 * -lets algorithm vary independently from client to client
 *
 * We can select behavior of an algorithm dynamically at runtime
 * -let client application pass algorithm to be used as parameter
 *
 * Principles of Strategy Pattern:
 *
 * - objects have responsibilities
 *
 * - different, specific implementations of these responsibilities manifested through use of polymorphism
 *
 * Strategy vs. State Pattern:
 *
 * - Strategy - subclasses decide how to implement steps in algorithm
 *
 * - State - alternative ot putting lots of conditionals in your context. Encapsulate interchangeable behaviors and use
 *   delegation to decide which behavior to use.
 *
 * - 1 difference: state 'context' contains state as an instance variable, which is used to dictate implementation of tasks.
 *   In strategy, strategy is passed as an argument to method and context object does not have any variable to store it.
 *
 * When to use:
 *
 * - When there's many related classes differ only in behavior.
 *
 * - When you need a variant of the an algorithm
 *
 * Example:
 *
 * - Context object takes in a Strategy object and argument values that the Strategy object will use.
 *
 * - The result will be different depending on what strategy object is given to the context's executeStrategy() method.
 *
 */

package Behavioral_Design_Strategy;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        int result = context.executeStrategy(new OperationAdd(), 10, 5);

        System.out.println("10 + 5 = " + result);

        result = context.executeStrategy(new OperationSubtract(), 10, 5);

        System.out.println("10 - 5 = " + result);

        result = context.executeStrategy(new OperationMultiply(), 10, 5);

        System.out.println("10 * 5 = " + result);
    }
}
