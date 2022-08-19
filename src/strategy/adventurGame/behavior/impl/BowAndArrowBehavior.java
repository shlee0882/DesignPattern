package strategy.adventurGame.behavior.impl;

import strategy.adventurGame.behavior.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("활을 사용합니다.");
    }
}
