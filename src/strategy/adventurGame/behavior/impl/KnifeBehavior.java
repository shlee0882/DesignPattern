package strategy.adventurGame.behavior.impl;

import strategy.adventurGame.behavior.WeaponBehavior;

public class KnifeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("칼을 사용합니다.");
    }
}
