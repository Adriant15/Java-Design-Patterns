/**
* Factory handle details of object creation
 * - Defines interface for creating object
 *
 * Decouples implementation of the product from its use
 *
 * Can add additional products or changes to implementation
 * without affecting creator
 *
 * Encapsulate object creation leads to code to abstraction and decouple client code from actual implementation
 *
 * Example:
 *
 * - AnimalFactoryInterface specifies what methods a concrete factory will need to implement. The only method inside
 *   AnimalFactory abstract class is the getAnimalType method that returns a object class that implements AnimalInterface.
 *
 * - In client, an AnimalInterface object can be created by passing in string argument to animalFacotry to specify what
 *   object it wants.
 *
*/

package Creational_Design_Patterns_Factory_Method;

public class Client {
    public static void main(String[] args) throws Exception{
        System.out.println("***Factory Pattern Demo***");
        AnimalFactoryInterface animalFactory = new ConcreteFactory();

        AnimalInterface duckType = animalFactory.GetAnimalType("Duck");
        duckType.Speak();

        AnimalInterface tigerType = animalFactory.GetAnimalType("Tiger");
        tigerType.Speak();

        AnimalInterface lionType = animalFactory.GetAnimalType("Lion");
        lionType.Speak();
    }
}
