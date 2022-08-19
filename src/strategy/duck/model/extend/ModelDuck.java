package strategy.duck.model.extend;

import strategy.duck.behavior.impl.fly.FlyNoWay;
import strategy.duck.behavior.impl.quack.Quack;
import strategy.duck.model.Duck;

public class ModelDuck extends Duck {
    public ModelDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }
    public void display(){
        System.out.println("저는 모형 오리입니다.");
    }
}
