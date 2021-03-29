/**
 * Encapsulates request as an object(command)
 *
 * Command object encapsulates a request by binding together a set of actions on a specific receiver
 * - expose just one method execute() that cause some actions to be invoked on the receiver
 *
 * Can perform undo/undo operations
 *
 * Makes code extensible as we can add new commands without changing existing code
 *
 * When to use?
 *
 * - parameterize objects by an action to perform
 *
 * - when you want to support undo
 *
 * - support logging changes so they can be reapplied in case of a system crash
 *
 * - when you want to specify, queue and execute request at different times
 *
 * Chain of Responsibility vs Command:
 *
 * - Chain of responsibility forward a request along a chain of objects without hope that any
 *   one of the objects along will handle the request
 *
 * - In command we will forward request to specific object
 *
 * Example:
 *
 * - The concrete commands are concrete classes of 'order' interface. They take instance of a stock and perform specific operation
 *
 * - The Invoke is the 'broker' class which asks the command to carry out the request by calling its execute() method.
 *
 */

package Behavioral_Design_Command;

public class Client {
    public static void main(String[] args) {
        Stock googleStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(googleStock);
        SellStock sellStock = new SellStock(googleStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStock);

        broker.placeOrders();
    }
}
