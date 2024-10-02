public class Main {
    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "song.mp3"); // Output: Playing MP3 file. Name: song.mp3
        audioPlayer.play("vlc", "video.vlc"); // Output: Playing VLC file. Name: video.vlc
        audioPlayer.play("avi", "movie.avi"); // Output: Invalid media. avi format not supported.
    }
}
