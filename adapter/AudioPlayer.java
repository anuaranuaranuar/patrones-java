package adapter;

public class AudioPlayer implements MediaPlayer {

    private MediaAdapter adapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Reproduciendo Mp3: " + fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            adapter = new MediaAdapter(audioType);
            adapter.play(audioType, fileName);
        } else {
            System.out.println("Formato no soportado " + audioType);
        }
    }

}
