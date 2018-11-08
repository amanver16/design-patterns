package com.aman.gof.smarttv.app.client;

import com.aman.gof.smarttv.app.concretecommand.ChangeChannelCommand;
import com.aman.gof.smarttv.app.concretecommand.PlayMusicCommand;
import com.aman.gof.smarttv.app.concretecommand.PlayVideoCommand;
import com.aman.gof.smarttv.app.concretecommand.VolumeDownCommand;
import com.aman.gof.smarttv.app.concretecommand.VolumeUpCommand;
import com.aman.gof.smarttv.app.invoker.SmartTvRemoteControl;
import com.aman.gof.smarttv.app.receiver.SmartTv;

/**
 * This class represents client which is responsible for creating concrete
 * command objects (eg- VolumeUpCommand) and sets the receiver's object
 * (SmartTv). Then it executes the command using invoker's object
 * (SmartTvRemoteControl)
 */
public class SmartTvUser {

    public static void main(String[] args) {

        // Create reciever object
        SmartTv smartTv = new SmartTv();

        // Create concrete command object and set the receiver
        ChangeChannelCommand changeChannelCommand = new ChangeChannelCommand(smartTv);
        VolumeUpCommand volumeUpCommand = new VolumeUpCommand(smartTv);
        VolumeDownCommand volumeDownCommand = new VolumeDownCommand(smartTv);
        PlayMusicCommand playMusicCommand = new PlayMusicCommand(smartTv);
        PlayVideoCommand playVideoCommand = new PlayVideoCommand(smartTv);

        // Setting attributes required by the commands
        changeChannelCommand.setChannelNumber(101);
        changeChannelCommand.setChannelName("Discovery Channel");
        playMusicCommand.setSongName("Shape of You");
        volumeUpCommand.setUnits(15);
        playVideoCommand.setVideoName("Despacito");
        volumeDownCommand.setUnits(5);

        // Pass the concrete command object to invoker to execute a command
        SmartTvRemoteControl changeTheChannel = new SmartTvRemoteControl(changeChannelCommand);
        SmartTvRemoteControl playMusic = new SmartTvRemoteControl(playMusicCommand);
        SmartTvRemoteControl increaseVolume = new SmartTvRemoteControl(volumeUpCommand);
        SmartTvRemoteControl playVideo = new SmartTvRemoteControl(playVideoCommand);
        SmartTvRemoteControl decreaseVolume = new SmartTvRemoteControl(volumeDownCommand);

        // Execute the commands using invoker's object
        changeTheChannel.exceute();
        playMusic.exceute();
        increaseVolume.exceute();
        playVideo.exceute();
        decreaseVolume.exceute();

    }

}