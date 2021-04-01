/**
 * Capture and externalize object's internal state so that object can be restored to this state later, without
 * violating encapsulation
 *
 * Object normally encapsulate all of their states. Exposing them would violate encapsulation. Memento addresses without
 * violating encapsulation.
 *
 * When to use:
 *
 * -When you want to be able to return to an object to one of its previous states.
 *
 * Drawback:
 *
 * - saving and restoring state can be time consuming
 *
 * Example:
 *
 * - States are stored in the originator objects (as String). Methods are setState(), getState(), saveStateToMemento()
 *   and getStateFromMemento.
 *
 * - Memento object stores the current state and is returned when the originator object saveStateToMemento is called.
 *
 * - Caretaker stores a list of memento in a List.
 *
 * - When a state is to be saved, the returned memento object from saveStateToMemento is added into the caretaker.
 *
 * - When a state is to be restored, the careTaker's get() methods a saved state (String data). Output is given to
 *   originator's getStateFromMemento and set as current state.
 *
 */

package Behavioral_Design_Memento;

public class Client {
    public static void main(String [] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State #1");
        originator.setState("State #2");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("State #4");
        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("First saved State: " + originator.getState());

        originator.getStateFromMemento(caretaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
