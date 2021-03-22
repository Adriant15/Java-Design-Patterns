package Structural_Design_Adapter;

public class AdvanceMediaPlayerAdapter implements MediaPlayerInterface{
    AdvanceMediaPlayerInterface advanceMusicPlayer;

    public AdvanceMediaPlayerAdapter(AdvanceMediaPlayerInterface myMediaPlayer){
        advanceMusicPlayer = myMediaPlayer;
    }

    @Override
    public void play(String audioType, String filename) {
        advanceMusicPlayer.loadFileName(filename);
        advanceMusicPlayer.listen();
    }

    @Override
    public void listen() {

    }
}
