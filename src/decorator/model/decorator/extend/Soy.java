package decorator.model.decorator.extend;

import decorator.model.beverage.Beverage;
import decorator.model.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }

}
