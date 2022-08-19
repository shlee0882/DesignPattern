package strategy.adventurGame.model.extend;

import strategy.adventurGame.behavior.impl.AxeBehavior;
import strategy.adventurGame.model.Character;

public class Troll extends Character {
    public Troll(){
        weaponBehavior = new AxeBehavior();
    }
}
