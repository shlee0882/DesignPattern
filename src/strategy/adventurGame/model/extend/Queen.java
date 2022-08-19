package strategy.adventurGame.model.extend;

import strategy.adventurGame.behavior.impl.BowAndArrowBehavior;
import strategy.adventurGame.model.Character;

public class Queen extends Character {
    public Queen () {
        weaponBehavior = new BowAndArrowBehavior();
    }
}
