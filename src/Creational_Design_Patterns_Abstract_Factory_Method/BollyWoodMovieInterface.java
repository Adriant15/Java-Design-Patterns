package Creational_Design_Patterns_Abstract_Factory_Method;

interface BollyWoodMovieInterface {
    String getMovieName();
}

class BollyWoodActionMovie implements BollyWoodMovieInterface{
    @Override
    public String getMovieName() {
        return "Bollywood Action Movie";
    }
}

class BollyWoodComedyMovie implements BollyWoodMovieInterface{
    @Override
    public String getMovieName(){
        return "Bollywood Comedy Movie";
    }
}