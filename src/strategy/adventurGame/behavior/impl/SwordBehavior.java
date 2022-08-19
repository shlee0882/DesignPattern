package strategy.adventurGame.behavior.impl;

import strategy.adventurGame.behavior.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("검을 사용합니다.");
    }
}
