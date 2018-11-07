package com.aman.gof.counterstrike.app.client;

import java.util.Random;

import com.aman.gof.counterstrike.app.concretehandler.Terrorist1;
import com.aman.gof.counterstrike.app.concretehandler.Terrorist2;
import com.aman.gof.counterstrike.app.concretehandler.Terrorist3;
import com.aman.gof.counterstrike.app.concretehandler.Terrorist4;
import com.aman.gof.counterstrike.app.concretehandler.Terrorist5;
import com.aman.gof.counterstrike.app.handler.Mission;

/**
 * This class represents the client which is responsible for creating the
 * request. It is not tightly coupled with concrete players. This class is also
 * responsible for creating the chain of responsibility (chain of handler
 * objects) and passes the request to the chain to handle the request. For
 * example server gives a bomb to a player and does not worry about which player
 * will plant the bomb. The chain will automatically detect the player from
 * implicit request
 */
public class ApnaDesiServer {

    private static String[] weapons = { "AK-47", "AWP", "M249", "P90", "Shotgun" };
    private static String[] terrorists = { "T1", "T2", "T3", "T4", "T5" };

    public static void main(String[] args) {

        // Intializing the chain
        Mission t1 = new Terrorist1();
        Mission t2 = new Terrorist2();
        Mission t3 = new Terrorist3();
        Mission t4 = new Terrorist4();
        Mission t5 = new Terrorist5();

        // Assign weapon to each player
        t1.assignWeapon(assignRandomWeapon());
        t2.assignWeapon(assignRandomWeapon());
        t3.assignWeapon(assignRandomWeapon());
        t4.assignWeapon(assignRandomWeapon());
        t5.assignWeapon(assignRandomWeapon());

        // Create chain of responsibility
        t1.setNextPlayer(t2);
        t2.setNextPlayer(t3);
        t3.setNextPlayer(t4);
        t4.setNextPlayer(t5);

        String bombCarrier = assignBomb();

        // Process the request to player chain to plant the bomb
        t1.plantTheBomb(bombCarrier);

    }

    private static String assignRandomWeapon() {
        Random random = new Random();
        int randomIndex = random.nextInt(weapons.length);
        return weapons[randomIndex];
    }

    private static String assignBomb() {
        Random random = new Random();
        int randomPlayer = random.nextInt(terrorists.length);
        return terrorists[randomPlayer];
    }

}