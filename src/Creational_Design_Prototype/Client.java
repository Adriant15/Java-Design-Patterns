/*

Advantages:

1) hides concrete product classes from client. Let client work with application-specific classes without mod

2) Incorporate new concrete product class into a system by registering a prototype instance with client

3) Let you define behavior through object composition, by specifying new values for object's variables, and
   not defining new classes

4) Let use define new "classes" without programming. Greatly reduce number of classes a system needs

5) Reduces subclassing

How it works:

1) Create abstract class which define common parameters.

2) Create classes that extends the abstract class and overrides the clone().

3) Create a cashe that will will store basicCar objects in a hash map. It will return a clone object when
   requested.

4) The client will load the cashe and get basicCar object.

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
