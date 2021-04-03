/**
 * Represents an operation(method) to be performed on the elements of an object structure(collection, lists, etc)
 * - lets you define a new operation without changing the classes of the elements on which it operates
 *
 * Add new functionalities to an existing object strucutre in such as way that the old structure remains unaffected by
 * these changes
 *
 * Useful when plugging into public APIs
 * - clients can perform operations on a class with a visiting class without modifying the source
 *
 * When to use:
 *
 * - When object structure (collection or list) contains many classes of objects with differing interfaces, and you want
 *   to perform operations on these objects that depend on their concrete classes. Visitor lets you keep related
 *   operations together by defining them in one class. Encourages cleaner code.
 *
 * - Decouple logical code from elements that you are using as input
 *
 * - When the object structure is shared by many applications, use the visitor pattern to put operations in just those
 *   applications that need them.
 *
 * Example:
 *
 * - Array list 'items' keep track of different items. The generic type are classes that implement Visitable interface.
 *
 * - Helper method 'calculatePostage' will iterate through array list and inject a visitor object into the item
 *   accept() method. The visitor will keep account of total postage required depending on items in the array list. The
 *   postage value is returned by calling visitor's getTotalPostage() method.
 *
 * - Each 'Visitable' object created will all have to implement accept() method that takes in an Visitor object.
 *
 * - Each visitor object is created separately.
 *
 * - The item object will give itself to the visitor object. The visitor object will do operation back on item object.
 *
 */

package Behavioral_Design_Visitor;

import java.util.ArrayList;

public class Client {
    //normal shopping cart stuff
    private static ArrayList<Visitable> items = new ArrayList<Visitable>();

    public static double calculatePostage(Visitor visitor) {
        //iterate through all items
        for(Visitable item: items) {
            item.accept(visitor);
        }
        double postage = visitor.getTotalPostage();
        return postage;
    }

    public static void main(String[] args) {
        // create a bunch of visitors (Book, CD, and DVD)
        Visitable myBook = new Book(8.52, 1.05);
        Visitable myCD = new CD(18.52, 3.05);
        Visitable myDVD = new DVD(6.53, 4.02);

        // add each vistor to the array list
        items.add(myBook);
        items.add(myCD);
        items.add(myDVD);

        Visitor visitor = new USPostageVisitor();
        double myPostage = calculatePostage(visitor);
        System.out.println("The total postage for my items shipped to the US is: " + myPostage);

        visitor = new SouthAmericaPostageVisitor();
        myPostage = calculatePostage(visitor);
        System.out.println("The total postage for my items shipped to South America is: " + myPostage);
    }
}
