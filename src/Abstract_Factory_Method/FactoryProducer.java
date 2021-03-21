package Abstract_Factory_Method;

public class FactoryProducer {
    public static MovieFactoryInterface getFactory(String choice){
        if(choice.equalsIgnoreCase("Comedy"))
            return new ComedyMovieFacotry();
        else if (choice.equalsIgnoreCase("Action"))
            return new ActionMovieFacotry();
        return null;
    }
}
