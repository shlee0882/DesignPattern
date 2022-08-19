package strategy.adventurGame;

import strategy.adventurGame.behavior.impl.KnifeBehavior;
import strategy.adventurGame.model.Character;
import strategy.adventurGame.model.extend.King;
import strategy.adventurGame.model.extend.Queen;
import strategy.adventurGame.model.extend.Troll;

public class GameSimulator {
    public static void main(String[] args){
        Character king = new King();
        king.fight();
        king.setWeaponBehavior(new KnifeBehavior());
        king.fight();

        Character queen = new Queen();
        queen.fight();

        Character troll = new Troll();
        troll.fight();

    }
}
