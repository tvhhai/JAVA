package patterns.adapter;

public class VideoAdapter implements VideoPlayer {

    VideoPlayer videoPlayer;

    public VideoAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            videoPlayer = new VlcPlayer();
        }else if (audioType.equalsIgnoreCase("mp4")){
            videoPlayer = new Mp4Player();
        }
    }

    @Override
    public void playVideo(String fileName) {
        videoPlayer.playVideo(fileName);
    }
}
