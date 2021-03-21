//FactorProducer class returns specific factory based on input string, and from that we can get specific objects made.
//In this example, the client would need to know the type of objects that can be created from, in this example, action
//movie factory, before the object can be created.

package Abstract_Factory_Method;

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
