package Behavioral_Design_Memento;

public class Memento {
    private String state;

    public Memento(String state)
    {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
