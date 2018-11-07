package com.aman.gof.counterstrike.app.concretehandler;

import com.aman.gof.counterstrike.app.handler.Mission;

/**
 * This class represents concrete handler which actually handles the requests.
 * It implements the handler interface to determine if it (Terrorist3) has the
 * capability to handle the request (checks if bomb carrier is terrorist 3),
 * otherwise it passes the request to next player
 */
public class Terrorist3 implements Mission {

    private Mission mission;

    @Override
    public void setNextPlayer(Mission mission) {
        this.mission = mission;
    }

    @Override
    public void assignWeapon(String weapon) {
        System.out.println("Terrorist 3 is having weapon " + weapon);
    }

    @Override
    public void plantTheBomb(String bombCarrier) {
        if ("T3".equalsIgnoreCase(bombCarrier)) {
            System.out.println("Player 3 is planting the bomb.");
            System.out.println("Bomb has been planted !!!");
        } else {
            this.mission.plantTheBomb(bombCarrier);
        }
    }

}