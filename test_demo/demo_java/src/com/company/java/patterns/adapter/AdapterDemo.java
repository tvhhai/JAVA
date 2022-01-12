package patterns.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        MediaPlayer1 mediaPlayer = new MediaPlayer1();

        mediaPlayer.play("mp3", "beyond the horizon.mp3");
        mediaPlayer.play("mp4", "alone.mp4");
        mediaPlayer.play("vlc", "far far away.vlc");

        mediaPlayer.play("avi", "mind me.avi");
    }
}