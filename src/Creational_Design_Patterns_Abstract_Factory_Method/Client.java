/**
 * Abstract factory provides interface for creating families of related or dependent
 * objects wtihout specifying their concrete class
 * - "factory of factories"
 *
 * When to use:
 *
 * - When dealing with multiple factories
 *
 * Example:
 *
 * - The client will get a factory from the FactoryProducer class by using string argument. That factory can now be used
 *   to create specific ojects.
 *
 */

package Creational_Design_Patterns_Abstract_Factory_Method;

public class Client {

    public static void main(String[] args) {
        MovieFactoryInterface actionMovie = FactoryProducer.getFactory("Action");

        HollyWoodMovieInterface hAction = actionMovie.GetHollyWoodMovie();
        BollyWoodMovieInterface bAction = actionMovie.GetBollyWoodMovie();

        System.out.println("\nAction movies are:");
        System.out.println(hAction.getMovieName());
        System.out.println(bAction.getMovieName());

        MovieFactoryInterface comedyMovie = FactoryProducer.getFactory("Comedy");

        HollyWoodMovieInterface hComedy = comedyMovie.GetHollyWoodMovie();
        BollyWoodMovieInterface bComedy = comedyMovie.GetBollyWoodMovie();

        System.out.println("\nComedy movies are:");
        System.out.println(hAction.getMovieName());
        System.out.println(bAction.getMovieName());
    }

}
