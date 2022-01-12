package patterns.adapter;

public class Mp4Player implements VideoPlayer {
    @Override
    public void playVideo(String fileName) {
        System.out.println("Mp4Player1 is playing mp4 file. Name: "+ fileName);
    }
}