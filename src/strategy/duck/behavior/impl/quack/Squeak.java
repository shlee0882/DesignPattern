package strategy.duck.behavior.impl.quack;

import strategy.duck.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("삑");
    }
}
