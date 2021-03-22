package Creational_Design_Prototype;

import java.util.Hashtable;

public class BasicCarCashe {
    private static Hashtable<String, BasicCar> basicCarMap = new Hashtable<>();

    public static BasicCar getCar(String carName){
        BasicCar cashedBasicCar = basicCarMap.get(carName);
        return (BasicCar) cashedBasicCar.clone();
    }

    public static void loadCashe(){
        BasicCar nano_base = new Nano("Green Nano");
        nano_base.price = 100000;
        basicCarMap.put("Green Nano", nano_base);

        BasicCar ford_base = new Ford("Yellow Ford");
        ford_base.price = 500000;
        basicCarMap.put("Yellow Ford", ford_base);
    }
}
