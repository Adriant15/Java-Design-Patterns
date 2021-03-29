/**
 * Avoids coupling of sender of a request to its receiver by giving more than one object a chance to
 * request
 *
 * Processes a series of objects one by one (sequential manner)
 *
 * When to use?
 *
 * - Decouple a request's sender and receiver. Both receiver and sender have no explicit knowledge of
 *   each other
 *
 * - When multiple objects are candidates to handle a request
 *
 * - When you do not want o specify handlers explicitly in your code
 *
 * Drawbacks:
 *
 * - Execution of request is not guaranteed, may fall off the end of the chain if no object handles it
 *
 * - Can be hard to observe and debug at runtime
 *
 * Example:
 *
 *
 */

package Behavioral_Design_Chain_Of_Responsibility;

public class Client {
    public static void main(String[] args){
        System.out.println("*****Chain of Responsibility Pattern Demo*****");

        // making the chain first: Fax -> Email
        ReceiverInterface faxHandler, emailHandler;

        // end of chain
        emailHandler = new EmailErrorHandler();

        // fax handler is before email
        faxHandler = new FaxErrorHandler();
        faxHandler.setNextChain(emailHandler);

        //starting point: raiser will raise issue and set first handler
        IssueRaiser raiser = new IssueRaiser(faxHandler);

        Message m1 = new Message("Fax msg1", MessagePriority.Normal);
        Message m2 = new Message("Email msg 1", MessagePriority.High);
        Message m3 = new Message("Email msg 2", MessagePriority.Normal);
        Message m4 = new Message("Fax msg2", MessagePriority.High);

        raiser.raiseMessage(m1);
        raiser.raiseMessage(m2);
        raiser.raiseMessage(m3);
        raiser.raiseMessage(m4);
    }
}
