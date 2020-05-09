package com.tournament.warrior;

import com.tournament.weapon.AxeWeapon;
import com.tournament.weapon.Buckler;
import com.tournament.weapon.OneHandedAxe;
import com.tournament.weapon.Weapon;

public class Viking implements Warrior {

    private int hitPoint = 120;
    private OneHandedAxe weapon;
    private Buckler personalArmour;

    public Viking() {
        this.weapon = new OneHandedAxe();
    }

    public void engage(Warrior warrior) {

    }

    public Viking equip(String type) {
        if (type.equals("buckler")) {
            this.personalArmour = new Buckler();
        }
        return this;
    }

    public int hitPoints() {
        return getHitPoint();
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        if (hitPoint < 0) {
            this.hitPoint = 0;
        } else {
            this.hitPoint = hitPoint;
        }
    }

    public OneHandedAxe getWeapon() {
        return weapon;
    }

    public Buckler getPersonalArmour() {
        return personalArmour;
    }
}
