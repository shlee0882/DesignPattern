package decorator.model.decorator;

import decorator.model.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;
    public abstract String getDescription();
}
