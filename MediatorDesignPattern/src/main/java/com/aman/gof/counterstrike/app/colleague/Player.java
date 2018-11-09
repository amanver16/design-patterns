package com.aman.gof.counterstrike.app.colleague;

/**
 * This interface represents colleague which implements colleague (Player)
 * interface and perform operation for communication.
 */
public interface Player {

    public void sendRadioMessage(Player player, String location, String radioMessage);

    public void receiveRadioMessage(Player player, String location, String radioMessage);

}