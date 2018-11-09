package com.aman.gof.counterstrike.app.concretemediator;

import java.util.ArrayList;
import java.util.List;

import com.aman.gof.counterstrike.app.colleague.Player;
import com.aman.gof.counterstrike.app.mediator.RadioCommand;

/**
 * This class represents concrete mediator which implements the mediator
 * (RadioCommand) interface. This class encapsulates colleagues (players) object
 * so that they can communicate to each other
 */
public class Gameplay implements RadioCommand {

    private List<Player> playerList;

    public Gameplay() {
        this.playerList = new ArrayList<>();
    }

    @Override
    public void addPlayer(Player player) {
        this.playerList.add(player);
    }

    @Override
    public void sendRadioCommand(Player player, String location, String radioCommand) {
        for (Player playerName : this.playerList) {
            if (playerName != player) {
                playerName.receiveRadioMessage(player, location, radioCommand);
            }
        }
    }

}