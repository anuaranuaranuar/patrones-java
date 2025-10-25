package adapter;

public class MediaAdapter implements MediaPlayer {
    
    private AdvanceMediaPlayer advancePlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("Mp4")) {
            advancePlayer = new AdvanceMediaPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advancePlayer.playMp4(fileName);
        }
    }
}
