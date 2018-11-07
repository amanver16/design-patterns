package com.aman.gof.counterstrike.app.handler;

/**
 * This interface represents the handler which declares methods to handle the
 * request (planting the bomb). The request is made by the client
 * (ApnaDesiServer). It also declares a method which provides successor (next
 * player) link. So that if one player object is not the bomb carrier, it will
 * pass the request to another player object to plant the bomb in the chain
 */
public interface Mission {

    public void setNextPlayer(Mission mission);

    public void assignWeapon(String weapon);

    public void plantTheBomb(String bombCarrier);

}