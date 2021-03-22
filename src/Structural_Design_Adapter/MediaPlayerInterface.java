package Structural_Design_Adapter;

interface MediaPlayerInterface {
    public void play(String audioType, String filename);
    public void listen();
}

class AudioPlayer implements MediaPlayerInterface{
    @Override
    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("mp3"))
            System.out.println("Playing mp3 file. Name: " + filename);
        else
            System.out.println("Invalid media. " + audioType + " format not supported.");
    }

    @Override
    public void listen() {

    }
}