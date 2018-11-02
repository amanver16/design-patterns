package com.aman.gof.counterstrike.app.flyweightfactory;

import java.util.HashMap;
import java.util.Map;

import com.aman.gof.counterstrike.app.concreteflyweight.CounterTerrorists;
import com.aman.gof.counterstrike.app.concreteflyweight.Terrorists;
import com.aman.gof.counterstrike.app.flyweight.Player;

/**
 * This class acts as flyweight factory, which manages flyweights (Terrorist &
 * CounterTerrorist) objects. This class ensures the flyweight object is shared
 * properly. When the client requests an object the flyweight factory gives
 * existing instance or creates a new one when required. Hence object creation
 * is as less as possible
 */
public class PlayerFactory {

    private static Map<String, Player> playerMap = new HashMap<>();

    public static Player getPlayer(String playerType) {

        Player player = null;

        if (playerMap.containsKey(playerType)) {
            player = playerMap.get(playerType);

        } else {

            switch (playerType) {

            case "T":
                System.out.println("Terrorist created.");
                player = new Terrorists();
                break;
            case "CT":
                System.out.println("Counter Terrorist created.");
                player = new CounterTerrorists();
                break;
            default:
                System.out.println("Hacker !! Get out.");
                break;
            }

            playerMap.put(playerType, player);

        }

        return player;

    }

}