package strategy.adventurGame.model;

import strategy.adventurGame.behavior.WeaponBehavior;

public abstract class Character {
    public WeaponBehavior weaponBehavior;

    public void fight(){
        weaponBehavior.useWeapon();
    }
    public void setWeaponBehavior(WeaponBehavior wb) {
        weaponBehavior = wb;
    }
}
