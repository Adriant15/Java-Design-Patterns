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
 */

package Behavioral_Design_Mediator;

public class Client {
}
