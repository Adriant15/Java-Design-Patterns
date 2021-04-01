/**
 * Takes responsibility of communication among a group of objects
 * - other objects know of the mediator and know they need to use the mediator to talk to each other
 *
 * Increases re-usability of objects supported by mediator by decoupling them from the system.
 *
 * Simplifies maintenance of system by centralizing control logic
 *
 * Allows you to replace one object in strucuture with a different one without affecting the classes and interfaces
 *
 * When to use:
 *
 * - To reduce communication complexity between multiple objects or classes
 *
 * - When a set of object communication in well-defined but complex ways. The resulting interdependencies are
 *   unstructured and difficult to understand.
 *
 * - When a behavior is distributed between several classes should customizable without a lot sub-classing
 *
 * Example:
 *
 * - The mediator gathers the buyer objects, perform function(s) and notify each buyer of the auction outcome
 *
 * - The buyers can talk to mediator and perform actions such as bid and cancel. The buyers do not talk to each other.
 *
 */

package Behavioral_Design_Mediator;

public class Client {
    public static void main(String[] args) {
        AuctionMediator med = new AuctionMediator();

        Buyer b1 = new AuctionBuyer(med, "Jason");
        Buyer b2 = new AuctionBuyer(med, "Ian");
        Buyer b3 = new AuctionBuyer(med, "Myra");

        // Add buyers to AuctionMediator's buyer list
        med.addBuyer(b1);
        med.addBuyer(b2);
        med.addBuyer(b3);

        System.out.println("Welcome to the auction. Tonight  we are selling a vacation to Vegas.  please Bid your offers.");
        System.out.println("-----------------------------------------------");

        System.out.println("Waiting for the buyer's offers...");

        // Making bids
        b1.bid(1800);
        b2.bid(2000);
        b3.bid(780);

        System.out.println("-----------------------------------------------");
        med.findHighestBidder();

        b2.cancelTheBid();
        System.out.print(b2.name + " Has canceled his bid!, in that case ");

        med.findHighestBidder();
    }
}
