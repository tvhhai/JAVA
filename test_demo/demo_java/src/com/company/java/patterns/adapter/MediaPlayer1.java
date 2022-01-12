package patterns.adapter;

public class MediaPlayer1 implements MediaPlayer {
    VideoAdapter videoAdapter;

    @Override
    public void play(String mediaType, String fileName) {
        //inbuilt support to play mp3 music files
        if(mediaType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: " + fileName);
        }

        //mediaAdapter is providing support to play other file formats
        else if(mediaType.equalsIgnoreCase("vlc") || mediaType.equalsIgnoreCase("mp4")){
            videoAdapter = new VideoAdapter(mediaType);
            videoAdapter.playVideo(fileName);
        } else {
            System.out.println("Invalid media. " + mediaType + " format not supported");
        }
    }
}
