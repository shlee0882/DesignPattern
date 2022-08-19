package strategy.adventurGame.model.extend;

import strategy.adventurGame.behavior.impl.KnifeBehavior;
import strategy.adventurGame.model.Character;

public class Knight extends Character {
    public Knight() {
        weaponBehavior = new KnifeBehavior();
    }
}
