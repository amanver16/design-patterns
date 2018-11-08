package com.aman.gof.smarttv.app.invoker;

import com.aman.gof.smarttv.app.command.SmartTvCommand;

/**
 * This class represents the invoker or executer which is responsible for
 * calling a command to be executed based on the command object
 */
public class SmartTvRemoteControl {

    private SmartTvCommand smartTvCommand;

    public SmartTvRemoteControl(SmartTvCommand smartTvCommand) {
        this.smartTvCommand = smartTvCommand;
    }

    public void exceute() {
        this.smartTvCommand.execute();
    }

}