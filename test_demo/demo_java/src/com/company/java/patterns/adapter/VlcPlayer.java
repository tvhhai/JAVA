package patterns.adapter;

public class VlcPlayer implements VideoPlayer {
    @Override
    public void playVideo(String fileName) {
        System.out.println("VlcPlayer1 is playing vlc file. Name: "+ fileName);
    }
}
