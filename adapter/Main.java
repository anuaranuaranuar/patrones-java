package adapter;

public class Main {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();

        player.play("mp3", "cancion Mp3");
        player.play("mp4", "video mp4");
        player.play("avi", "pelicula avi");
    }
}
