package com.company.designpattern.structural.adapter;

public class Adapter5 {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();

        mediaPlayer.playMedia("mp3", "beyond the horizon.mp3");
        mediaPlayer.playMedia("mp4", "alone.mp4");
        mediaPlayer.playMedia("vlc", "far far away.vlc");
        mediaPlayer.playMedia("avi", "mind me.avi");

    }
}


interface Media {
    void playMedia(String type, String fileName);
}

interface Video {
    void playVideo(String fileName);
}

class Mp4Video implements Video {
    @Override
    public void playVideo(String fileName) {
        System.out.println("Play Mp4 video" + fileName);
    }
}

class VlcVideo implements Video {
    @Override
    public void playVideo(String fileName) {
        System.out.println("Play vlc video" + fileName);
    }
}

class MediaAdapter implements Media {
    Video video;

    public MediaAdapter(String type) {
        if (type.equalsIgnoreCase("vlc")) {
            video = new VlcVideo();
        } else if (type.equalsIgnoreCase("mp4")) {
            video = new Mp4Video();
        }
    }

    @Override
    public void playMedia(String type, String fileName) {
        if (type.equalsIgnoreCase("vlc") || type.equalsIgnoreCase("mp4")) {
            video.playVideo(fileName);
        }
    }
}

class MediaPlayer implements Media {
    MediaAdapter mediaAdapter;

    @Override
    public void playMedia(String type, String fileName) {
        if (type.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if (type.equalsIgnoreCase("vlc") || type.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(type);
            mediaAdapter.playMedia(type, fileName);
        } else {
            System.out.println("Invalid media. " + type + " format not supported");
        }
    }
}