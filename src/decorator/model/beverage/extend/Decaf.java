package decorator.model.beverage.extend;

import decorator.model.beverage.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        description = "๋์นดํ์ธ";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
