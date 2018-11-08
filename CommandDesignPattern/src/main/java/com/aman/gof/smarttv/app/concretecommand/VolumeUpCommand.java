package com.aman.gof.smarttv.app.concretecommand;

import com.aman.gof.smarttv.app.command.SmartTvCommand;
import com.aman.gof.smarttv.app.receiver.SmartTv;

/**
 * This class represents the concrete command which actually passes the requests
 * (sent by client using invoker's object) to the receiver (smart tv) to perform an
 * operation (Decrease the volume).
 */
public class VolumeUpCommand implements SmartTvCommand {

    private SmartTv smartTv;
    private int units;

    // Setting receiver object
    public VolumeUpCommand(SmartTv smartTv) {
        this.smartTv = smartTv;
    }

    @Override
    public void execute() {
        this.smartTv.volumeUp(units);
    }

    // Setter
    public void setUnits(int units) {
        this.units = units;
    }

}