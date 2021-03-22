package Structural_Design_Adapter;

interface AdvanceMediaPlayerInterface {
    public void loadFileName(String fileName);
    public void listen();
}

class VlcPlayer implements AdvanceMediaPlayerInterface{
    String myfile;

    @Override
    public void loadFileName(String fileName) {
        myfile = fileName;
    }

    @Override
    public void listen() {
        System.out.println("Playing vlc file. Name: " + myfile);
    }
}

class Mp4Player implements AdvanceMediaPlayerInterface{
    String myfile;

    @Override
    public void loadFileName(String fileName) {
        myfile = fileName;
    }

    @Override
    public void listen() {
        System.out.println("Playing mp4 file. Name: " + myfile);
    }
}