package com.aman.gof.counterstrike.app.mediator;

import com.aman.gof.counterstrike.app.colleague.Player;

/**
 * This interface represents mediator which declares methods through which
 * colleagues (players) communicates
 */
public interface RadioCommand {

    public void addPlayer(Player player);

    public void sendRadioCommand(Player player, String location, String radioCommand);

}