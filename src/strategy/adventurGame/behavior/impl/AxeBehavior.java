package strategy.adventurGame.behavior.impl;

import strategy.adventurGame.behavior.WeaponBehavior;

public class AxeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("도끼를 사용합니다.");
    }
}
