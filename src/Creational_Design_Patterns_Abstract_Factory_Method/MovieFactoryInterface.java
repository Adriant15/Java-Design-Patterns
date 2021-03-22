package Creational_Design_Patterns_Abstract_Factory_Method;

interface MovieFactoryInterface {
    HollyWoodMovieInterface GetHollyWoodMovie();
    BollyWoodMovieInterface GetBollyWoodMovie();
}

class ActionMovieFacotry implements MovieFactoryInterface{
    public HollyWoodMovieInterface GetHollyWoodMovie(){
        return new HollyWoodActionMovie();
    }

    public BollyWoodMovieInterface GetBollyWoodMovie(){
        return new BollyWoodActionMovie();
    }
}

class ComedyMovieFacotry implements MovieFactoryInterface{
    public HollyWoodMovieInterface GetHollyWoodMovie(){
        return new HollyWoodComedyMovie();
    }

    public BollyWoodMovieInterface GetBollyWoodMovie(){
        return new BollyWoodComedyMovie();
    }
}