//You are developing a media player application. There is a base class called MediaPlayer, 
//which has methods like play(), pause(), and stop(). The VideoPlayer class inherits from MediaPlayer and 
//adds methods like rewind() and fastForward(). Additionally, there is an interface called Playlist,
 //which defines methods like addSong() and removeSong(). The VideoPlayer class implements the Playlist interface. 
 //Implement the classes and demonstrate inheritance with interface by creating objects of the VideoPlayer class and
  //calling its methods as well as the interface methods.

import java.util.ArrayList;

// Base class
class MediaPlayer {
    public void play() {
        System.out.println("Media is playing.");
    }

    public void pause() {
        System.out.println("Media is paused.");
    }

    public void stop() {
        System.out.println("Media is stopped.");
    }
}

// Interface
interface Playlist {
    void addSong(String songName);
    void removeSong(String songName);
}

// Subclass that extends MediaPlayer and implements Playlist
class VideoPlayer extends MediaPlayer implements Playlist {
    private ArrayList<String> playlist = new ArrayList<>();

    public void rewind() {
        System.out.println("Video is rewinding.");
    }

    public void fastForward() {
        System.out.println("Video is fast-forwarding.");
    }

    @Override
    public void addSong(String songName) {
        playlist.add(songName);
        System.out.println("\"" + songName + "\" added to playlist.");
    }

    @Override
    public void removeSong(String songName) {
        if (playlist.remove(songName)) {
            System.out.println("\"" + songName + "\" removed from playlist.");
        } else {
            System.out.println("\"" + songName + "\" not found in playlist.");
        }
    }

    public void showPlaylist() {
        System.out.println("Current Playlist: " + playlist);
    }
}

// Main class to test everything
public class MediaPlayerTest {
    public static void main(String[] args) {
        VideoPlayer vp = new VideoPlayer();

        // MediaPlayer methods
        vp.play();
        vp.pause();
        vp.stop();

        // VideoPlayer methods
        vp.rewind();
        vp.fastForward();

        // Playlist interface methods
        vp.addSong("Song A");
        vp.addSong("Song B");
        vp.showPlaylist();
        vp.removeSong("Song A");
        vp.showPlaylist();
    }
}
