package com.tournament.warrior;

import com.tournament.weapon.AxeWeapon;
import com.tournament.weapon.OneHandedAxe;

public class Highlander implements Warrior {

    private int hitPoints;
    private AxeWeapon oneHandedAxe = new OneHandedAxe();

    public Highlander() {
    }

    public Highlander(String veteran) {

    }

    public int hitPoints() {
        return getHitPoints();
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
