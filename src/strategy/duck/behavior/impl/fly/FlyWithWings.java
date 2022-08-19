package strategy.duck.behavior.impl.fly;

import strategy.duck.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날수있어요");
    }
}
