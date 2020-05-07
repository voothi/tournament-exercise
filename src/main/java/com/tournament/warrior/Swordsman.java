package com.tournament.warrior;

import com.tournament.weapon.OneHandedSword;
import com.tournament.weapon.SwordWeapon;

public class Swordsman implements Warrior {

    private int hitPoints;
    private SwordWeapon oneHandedSword = new OneHandedSword();

    public Swordsman() {
    }

    public Swordsman(String vicious) {

    }

    public void engage(Viking viking) {

    }

    public void engage(Highlander highlander) {

    }

    public Swordsman equip(String type) {
        return null;
    }

    public int hitPoints() {
        return getHitPoints();
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
