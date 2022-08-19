package strategy.duck.behavior.impl.quack;

import strategy.duck.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<조용>>");
    }
}
