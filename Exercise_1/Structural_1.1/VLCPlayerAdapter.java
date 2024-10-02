// Adapter for VLC Player to make it compatible with MediaPlayer
public class VLCPlayerAdapter implements MediaPlayer {
    private VLCPlayer vlcPlayer;

    public VLCPlayerAdapter() {
        this.vlcPlayer = new VLCPlayer();
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            vlcPlayer.playVLC(fileName);
        }
    }
}
