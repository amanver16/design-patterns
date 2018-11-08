package com.aman.gof.smarttv.app.concretecommand;

import com.aman.gof.smarttv.app.command.SmartTvCommand;
import com.aman.gof.smarttv.app.receiver.SmartTv;

/**
 * This class represents the concrete command which actually passes the requests
 * (sent by client using invoker's object) to the receiver (smart tv) to perform an
 * operation (Increase the volume).
 */
public class VolumeDownCommand implements SmartTvCommand {

    private SmartTv smartTv;
    private int units;

    // Setting receiver object
    public VolumeDownCommand(SmartTv smartTv) {
        this.smartTv = smartTv;
    }

    @Override
    public void execute() {
        this.smartTv.volumeDown(units);
    }

    // Setter
    public void setUnits(int units) {
        this.units = units;
    }

}