/**
 * Adapter converts interface of an class into another interface that clients expects
 * - works as bridge between 2 incompatible interfaces. Adapter does the conversion
 * - lets classes work together that could not otherwise
 *
 * Decouple client from implemented interface
 * - client does not need to be modified each time it needs to operate against a different interface
 *
 * When to use:
 *
 * - Needs to adapt new code to existing code. The problem can't be solved by changing existing
 *   code and can't change new code. Solution would be to write a class that adapts new vendor interface into
 *   existing code.
 *
 * - create reusable class that cooperates with unrelated or unforeseen classes (classes that do not
 *   necessarily have compatible interfaces)
 *
 * - Need to use several existing subclasses, but it is impractical to adapt their interfaces by sub-classing
 *   (adapter can adapt interface of its parent class)
 *
 * Example:
 *
 * -Build an adapter to allow media player ("audio player") be able to accept files format to be handled by advance
 *  audio player (either a "mp4 player" or "VLC player").
 *
 *  -Adapter class implements MediaPlayerInterface and will great an object that implements AdvanceMediaPlayerInterface
 *   in the constructor. The adapter class will methods from MediaPlayerInterface and will pass parameters to methods of
 *   AdvanceMediaPlayerInterface object.
 *
 * -Client class: creates an adapter with object type of MediaPlayerInterface and takes in an instance of
 *  AdvanceMediaPlayerInterface in parameter. Client will use the new interface but will not know what class is used in
 *  the adapter class.
 *
 */

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
