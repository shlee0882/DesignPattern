package strategy.duck;

import strategy.duck.behavior.impl.fly.FlyRocketPowered;
import strategy.duck.model.Duck;
import strategy.duck.model.extend.MallardDuck;
import strategy.duck.model.extend.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}