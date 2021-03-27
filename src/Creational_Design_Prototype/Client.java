/**
 * Hides concrete product classes from client. Let client work with application-specific classes without mod
 *
 * Incorporate new concrete product class into a system by registering a prototype instance with client
 *
 * Let you define behavior through object composition, by specifying new values for object's variables, and
 * not defining new classes
 *
 * Let use define new "classes" without programming. Greatly reduce number of classes a system needs
 *
 * Reduces subclassing
 *
 * Example:
 *
 * 1) An abstract class which define common parameters.
 *
 * 2) Create classes that extends the abstract class and overrides the clone() to provide clone if possible.
 *
 * 3) Create a cashe class that will do two things:
 *    - create a cashe of objects in a hashtable (synchronized)
 *    - It will a getter method that will return a clone of a cashed object based on string argrument
 *
 * 5) Methods of cashe class is public and static
 *
 * 6) The client will load the cashe and get basicCar object.
 *
 * 7) When clone object is retrieved, it must be casted to the correct object type.
 *    - Subclasses extends abstract class and overrides clone()
 */


package Creational_Design_Prototype;

public class Client {
    public static void main(String[] args){
        System.out.println("***Prototype Pattern Demo***");

        BasicCarCashe.loadCashe();

        BasicCar bc1 = (BasicCar) BasicCarCashe.getCar("Green Nano");

        bc1.price = bc1.price + BasicCar.setPrice();
        System.out.println("Car is: " + bc1.getModelName() + " and its price is Rs." + bc1.price);

        bc1 = (BasicCar) BasicCarCashe.getCar("Yellow Ford");

        bc1.price = bc1.price + BasicCar.setPrice();
        System.out.println("Car is: " + bc1.getModelName() + " and its price is Rs." + bc1.price);
    }

}
