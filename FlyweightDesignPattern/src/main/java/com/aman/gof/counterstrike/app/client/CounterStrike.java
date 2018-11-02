package com.aman.gof.counterstrike.app.client;

import java.util.Random;

import com.aman.gof.counterstrike.app.flyweight.Player;
import com.aman.gof.counterstrike.app.flyweightfactory.PlayerFactory;

/**
 * This class defines client which holds reference of flyweights (terrorist &
 * counter terrorist). To get a refrence it takes help of flyweight factory
 * (Player Factory). The client is responsible for storing or calculating
 * extrinsic state (Weapon) of flyweight objects.
 */
public class CounterStrike {

    private static String[] playerType = { "T", "CT" };
    private static String[] weapons = { "AK-47", "M4A1", "AWP", "P90", "Desert-Eagle", "Machine Gun", "Scout",
            "Knife" };

    public static void main(String[] args) {

        for (int terrorist = 0; terrorist < 5; terrorist++) {
            Player player = PlayerFactory.getPlayer(playerType[0]);
            player.assignWeapon(getRandomWeapon());
            player.mission();
        }

        for (int counterTerrorist = 0; counterTerrorist < 5; counterTerrorist++) {
            Player player = PlayerFactory.getPlayer(playerType[1]);
            player.assignWeapon(getRandomWeapon());
            player.mission();
        }

    }

    public static String getRandomWeapon() {
        Random random = new Random();
        int randomIndex = random.nextInt(weapons.length);
        return weapons[randomIndex];
    }

}