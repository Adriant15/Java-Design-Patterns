package Structural_Design_Adapter;

public class Client {
    public static void main(String[] args){
        MediaPlayerInterface audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "music.mp3");

        AdvanceMediaPlayerInterface mp4Player = new Mp4Player();
        MediaPlayerInterface advanceMediaPlayerAdapter1 = new AdvanceMediaPlayerAdapter(mp4Player);
        advanceMediaPlayerAdapter1.play("mp4", "video.mp4");

        AdvanceMediaPlayerInterface vlcPlayer = new VlcPlayer();
        MediaPlayerInterface advanceMediaPlayerAdapter2 = new AdvanceMediaPlayerAdapter(vlcPlayer);
        advanceMediaPlayerAdapter2.play("vlc", "song.vlc");

        audioPlayer.play("vlc", "song.vlc");
    }

}
