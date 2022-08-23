package decorator.model.decorator.extend;

import decorator.model.beverage.Beverage;
import decorator.model.decorator.CondimentDecorator;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 우유";
    }

    @Override
    public double cost() {
        if(beverage.getSize() == SIZE.VENTI) return beverage.cost() + 0.20;
        else if(beverage.getSize() == SIZE.GRANDE) return beverage.cost() + 0.15;
        else return beverage.cost() + 0.10;
    }

}
