package com.tournament.warrior;

import com.tournament.weapon.*;

public class Highlander implements Warrior {

    private int hitPoint;
    private TwoHandedSword weapon;

    public Highlander() {
        this.weapon = new TwoHandedSword();
    }

    public Highlander(String veteran) {

    }

    public void engage(Warrior warrior) {

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

    public TwoHandedSword getWeapon() {
        return weapon;
    }
}
