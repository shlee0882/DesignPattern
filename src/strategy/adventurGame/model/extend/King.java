package strategy.adventurGame.model.extend;

import strategy.adventurGame.behavior.impl.SwordBehavior;
import strategy.adventurGame.model.Character;

public class King extends Character {
    public King() {
        weaponBehavior = new SwordBehavior();
    }
}
