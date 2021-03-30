/**
 * Searching for string matches a pattern is a common problem
 * - regular expressions
 *
 * Allow you to easily change or extend a language
 *
 * Drawback:
 *
 * - When number of grammar rules is large, it is harder to maintain the code
 *
 * - Requires a lot of error checking and a lot of expressions and code to evaluate
 *
 * When to use:
 *
 * - Use when there is a language to interpret and when the language is simple (not many grammar rules)
 *
 * - Use for scripting and programming languages
 *
 * Example:
 *
 * - Expression interface: implementing class defines interpret() method and what to do with input 'context'
 *
 * - One class is defined for each operator (1 for OR and 1 for AND) and implements Expression interface. Interpret()
 *   method determines how each input expression object do with input 'context'
 *
 * - Context class: contains information global to interpreter. Use the context to store and access state of interpreter.
 *
 * - Client: creates helper classes that build and return expression objects. New context is created and input into
 *   expressions created by the hlper classes.
 *
 */

package Behavioral_Design_Interpreter;

public class Client {

    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWomenExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args){

        //custom expressions
        Expression isMale = getMaleExpression();
        Expression isMarriedWomen = getMarriedWomenExpression();

        Context ic1 = new Context("John");
        //equals expr1.interpret(ic1) || expr2.interpret(ic1);
        System.out.println("John is male? " + isMale.interpret(ic1));

        Context ic2 = new Context("Married Julie");
        //equals expr1.interpret(ic1) && expr2.interpret(ic1);
        System.out.println("Julie is a married women? " + isMarriedWomen.interpret(ic2));

        Context ic3 = new Context("Lucy");
        //equals expr1.interpret(ic1) || expr2.interpret(ic1);
        System.out.println("Lucy is male? " + isMale.interpret(ic3));
    }
}
