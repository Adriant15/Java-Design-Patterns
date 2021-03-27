/**
 * Builder separates construction of complex object from its representation
 * - use construction process to create same object, but these processes create different representation of the object
 *
 * When to use:
 *
 * - When dealing with with objects with a lot of attributes
 *
 * - One way to solve optional parameters problem
 *
 * Should not use:
 *
 * - If we want mutable object, which can be modified after creating process is over.
 *
 * Example:
 *
 * - Product class - Describes properties of the product object class (ie: parts of a vehicle).
 *
 * - BuilderInterface - The interface outline how all properties of a product can be built and different product classes
 *   that implement this interface (ie: car and motocycle). Each class that implements BuilderInterfaces is used to build
 *   a specific product object. Return object as type of Product class.
 *
 * - Director class - Directs how a product is built in construct method.
 *
 * - Client class - Creates instance of the director. The director takes in an instance of the product with construct() and
 *   constructs the properties of that product (ie: add parts to a car object).
 *
 */

package Creational_Design_Patterns_Builder;

public class Client {
    public static void main(String[] args){
        System.out.println("***Builder Pattern Demo***");

        Director director = new Director();

        BuilderInterface carBuilder = new Car();
        BuilderInterface motorBuilder = new Motorcycle();

        director.construct(carBuilder);
        Product p1 = carBuilder.getVehicle();
        p1.show();

        director.construct(motorBuilder);
        Product p2 = motorBuilder.getVehicle();
        p2.show();

    }
}
