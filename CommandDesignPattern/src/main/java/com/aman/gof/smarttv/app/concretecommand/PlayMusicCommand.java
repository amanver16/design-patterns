package com.aman.gof.smarttv.app.concretecommand;

import com.aman.gof.smarttv.app.command.SmartTvCommand;
import com.aman.gof.smarttv.app.receiver.SmartTv;

/**
 * This class represents the concrete command which actually passes the requests
 * (sent by client using invoker's object) to the receiver (smart tv) to perform an
 * operation (Play the music).
 */
public class PlayMusicCommand implements SmartTvCommand {

    private SmartTv smartTv;
    private String songName;

    // Setting receiver object
    public PlayMusicCommand(SmartTv smartTv) {
        this.smartTv = smartTv;
    }

    @Override
    public void execute() {
        this.smartTv.playMusic(songName);
    }

    // Setter
    public void setSongName(String songName) {
        this.songName = songName;
    }

}