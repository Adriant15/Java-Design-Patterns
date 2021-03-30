/**
 * provides a way to access the elements of an aggregate objects sequentially without exposing underlying representation.
 *
 * In java, used on collection such as linked lists and hash table.
 *
 * Iterator object responsible for keeping track of current element
 *
 * When to use:
 *
 * - When you want to provide standard way to iterate over collection and hide implementation
 *   logic from client
 *
 * - support multiple traversal of aggregate objects
 *
 * - use to support polymorphic iteration
 *
 * Example:
 *
 * - A subject concrete class contains data in a collection. Each subject concrete class implements SubjectInterface to
 *   return a specific iterator. The constructor of the iterator takes the data collection object.
 *
 * - The iterator implements four methods: first(), next(), isDone() and currentItem().
 *
 * - In client, each subject class is create. It can call the createIterator() method and return an iterator that implements
 *   IteratorInterface interface.
 */

package Behavioral_Design_Iterator;

public class Client {
    public static void Print(IteratorInterface iterator){
        while(!iterator.isDone()){
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args){
        System.out.println("*****Iterator Pattern Demo*****");
        SubjectInterface Sc_subject = new Science();
        SubjectInterface Ar_Subject = new Arts();

        IteratorInterface Sc_iterator = Sc_subject.createIterator();
        IteratorInterface Ar_iterator = Ar_Subject.createIterator();

        System.out.println("\nScience Subjects: ");
        Print(Sc_iterator);

        System.out.println("\nArts Subjects: ");
        Print(Ar_iterator);
    }
}
