package com.tournament.warrior;

import com.tournament.weapon.Buckler;
import com.tournament.weapon.OneHandedSword;

public class Swordsman implements Warrior {

    private int hitPoint = 100;
    private OneHandedSword weapon;
    private Buckler personalArmour;

    public Swordsman() {
        this.weapon = new OneHandedSword();
    }

    public Swordsman(String mode) {
        this();
        if (mode.equals("vicious")) {

        }
    }

    /*
     * пока кто-то не умрет - бой
     *
     * если щит стаботал, то урона нет
     * иначе
     * урон есть - уменьшение здоровья
     *
     * конец пока
     *
     * */
    public void engage(Viking viking) {
        while (this.getHitPoint() > 0 && viking.getHitPoint() > 0) {
            viking.getPersonalArmour().repelBlow(this.getWeapon());


/*            viking.setHitPoint(viking.getHitPoint() - this.getWeapon().getDmgPoint());
            this.setHitPoint(this.getHitPoint() - viking.getWeapon().getDmgPoint());*/
        }


        System.out.println(this.getHitPoint() + " " + viking.getHitPoint());
    }

    public void engage(Highlander highlander) {
        while (this.getHitPoint() > 0 && highlander.getHitPoint() > 0) {
            highlander.setHitPoint(highlander.getHitPoint() - this.getWeapon().getDmgPoint());
            this.setHitPoint(this.getHitPoint() - highlander.getWeapon().getDmgPoint());
        }

        System.out.println(this.getHitPoint() + " " + highlander.getHitPoint());
    }

    public Swordsman equip(String type) {
        if (type.equals("buckler")) {
            this.personalArmour = new Buckler();
        }
        return this;
    }

    @Override
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

    public OneHandedSword getWeapon() {
        return weapon;
    }
}
