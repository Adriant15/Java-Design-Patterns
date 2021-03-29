package Behavioral_Design_Command;

interface Order {
    void execute();
}

class BuyStock implements Order{
    private Stock myStock;
    //store previous state for undo

    public BuyStock(Stock someStock){
        this.myStock = someStock;
    }

    public void execute(){
        // save previous state, in case of undo
        myStock.buy();
    }

    //Can also have undo method to restore previous state
}

class SellStock implements Order{
    private Stock myStock;

    public SellStock(Stock someStock){
        this.myStock = someStock;
    }

    public void execute(){
        myStock.sell();
    }
}