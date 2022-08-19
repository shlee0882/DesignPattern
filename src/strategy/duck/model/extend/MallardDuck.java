package strategy.duck.model.extend;

import strategy.duck.behavior.impl.fly.FlyWithWings;
import strategy.duck.behavior.impl.quack.Quack;
import strategy.duck.model.Duck;

public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}
