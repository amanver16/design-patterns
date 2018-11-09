package com.aman.gof.counterstrike.app.concretecolleague;

import com.aman.gof.counterstrike.app.colleague.Player;
import com.aman.gof.counterstrike.app.mediator.RadioCommand;

/**
 * This class represents concrete colleague which implements colleague (Player)
 * interface and perform operation for communication. The player knows how to
 * use radio commands means the colleague knows about mediator object and
 * mediator does the rest
 */
public class Wizard implements Player {

    private RadioCommand radioCommand;

    public Wizard(RadioCommand radioCommand) {
        this.radioCommand = radioCommand;
    }

    @Override
    public void sendRadioMessage(Player player, String location, String radioMessage) {
        System.out.println(this.getClass().getSimpleName() + " sending message !!! ");
        this.radioCommand.sendRadioCommand(player, location, radioMessage);
    }

    @Override
    public void receiveRadioMessage(Player player, String location, String radioMessage) {
        System.out.println(this.getClass().getSimpleName() + " received radio message from "
                + player.getClass().getSimpleName() + " (" + location + ") : " + radioMessage);
    }

}