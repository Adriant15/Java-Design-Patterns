package Creational_Design_Patterns_Abstract_Factory_Method;

interface HollyWoodMovieInterface {
    String getMovieName();
}

class HollyWoodActionMovie implements HollyWoodMovieInterface{
    @Override
    public String getMovieName() {
        return "Hollywood Action Movie";
    }
}

class HollyWoodComedyMovie implements HollyWoodMovieInterface{
    @Override
    public String getMovieName(){
        return "Hollywood Comedy Movie";
    }
}