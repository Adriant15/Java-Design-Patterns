package Structural_Design_Proxy;

public interface Internet {
    public void connectTo(String serverhost) throws Exception;
}

class RealInternet implements Internet {
    @Override
    public void connectTo(String serverhost) throws Exception {
        System.out.println("Connecting to " + serverhost);
    }
}