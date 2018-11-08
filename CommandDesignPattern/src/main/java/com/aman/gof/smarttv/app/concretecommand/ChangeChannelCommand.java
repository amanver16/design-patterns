package com.aman.gof.smarttv.app.concretecommand;

import com.aman.gof.smarttv.app.command.SmartTvCommand;
import com.aman.gof.smarttv.app.receiver.SmartTv;

/**
 * This class represents the concrete command which actually passes the requests
 * (sent by client using invoker's object) to the receiver (smart tv) to perform an
 * operation (Change the channel).
 */
public class ChangeChannelCommand implements SmartTvCommand {

    private SmartTv smartTv;
    private int channelNumber;
    private String channelName;

    // Setting reciever object
    public ChangeChannelCommand(SmartTv smartTv) {
        this.smartTv = smartTv;
    }

    @Override
    public void execute() {
        this.smartTv.changeChannel(channelNumber, channelName);
    }

    // Setter Methods

    public int getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(int channelNumber) {
        this.channelNumber = channelNumber;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

}