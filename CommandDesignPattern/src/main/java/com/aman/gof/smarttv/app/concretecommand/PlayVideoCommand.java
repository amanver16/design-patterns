package com.aman.gof.smarttv.app.concretecommand;

import com.aman.gof.smarttv.app.command.SmartTvCommand;
import com.aman.gof.smarttv.app.receiver.SmartTv;

/**
 * This class represents the concrete command which actually passes the requests
 * (sent by client using invoker's object) to the receiver (smart tv) to perform an
 * operation (Play the video).
 */
public class PlayVideoCommand implements SmartTvCommand {

    private SmartTv smartTv;
    private String videoName;

    // Setting receiver object
    public PlayVideoCommand(SmartTv smartTv) {
        this.smartTv = smartTv;
    }

    @Override
    public void execute() {
        this.smartTv.playVideo(videoName);
    }

    // Setter
    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

}