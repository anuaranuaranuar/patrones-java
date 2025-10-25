package adapter;

public class Mp3Player implements MediaPlayer {

    
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Reproduciendo mp3: "+ fileName);            
        } else {
            System.out.println("Formato no soportado: " + audioType);
        }
    }
    
}
