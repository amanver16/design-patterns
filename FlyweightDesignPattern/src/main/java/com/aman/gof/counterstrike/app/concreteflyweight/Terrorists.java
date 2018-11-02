package com.aman.gof.counterstrike.app.concreteflyweight;

import com.aman.gof.counterstrike.app.flyweight.Player;

/**
 * This class defines concrete flyweight. Any state it stores must be sharable
 * which means intrinsic. So MISSION in this example is intrinsic, because all
 * terrorist have same mission. But weapon here is extrinsic, because they may
 * chose different weapons.
 */
public class Terrorists implements Player {

    // Intrinsic State
    private final String MISSION;
    // Extrinsic State
    private String weapon;

    public Terrorists() {
        MISSION = "Plant The Bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Terrorist with weapon " + this.weapon);
        System.out.println("Mission is : " + MISSION);
    }

}