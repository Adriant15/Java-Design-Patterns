//AnimalFactoryInterface specifies what methods a concrete factory will
//need to implement. The only method inside AnimalFactory abstract class
//is the getAnimalType method that returns a object class that implments
//AnimalInterface.
//
//Abstract Creator: create concrete factory class extends/implements another
//abstract class/interface to create objects
//
//Concrete Creator: create instance of the factory and create objects
//directly
//
//Static Method Creator: method to create object inside factory is static,
//so no need to create an instance of the factory to create objects.

package Factory_Method;

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
