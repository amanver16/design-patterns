package com.aman.gof.smarttv.app.receiver;

/**
 * This class represents as the receiver which receives requests (e.g- Change
 * the channel) from the concrete command objects (e.g- ChangeChannelCommand)
 * and performs an operation (eg- Changes the channel).
 */
public class SmartTv {

    public void changeChannel(int channelNumber, String channelName) {
        System.out.println("Current channel is " + channelNumber + ": " + channelName);
    }

    public void volumeUp(int units) {
        System.out.println("Volume is increased by " + units + " units.");
    }

    public void volumeDown(int units) {
        System.out.println("Volume is decreased by " + units + " units.");
    }

    public void playMusic(String songName) {
        System.out.println("Playing song: " + songName);
    }

    public void playVideo(String videoName) {
        System.out.println("Playing video: " + videoName);
    }

}