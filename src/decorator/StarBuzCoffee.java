package decorator;

import decorator.model.beverage.Beverage;
import decorator.model.beverage.extend.DarkRoast;
import decorator.model.beverage.extend.Espresso;
import decorator.model.beverage.extend.HouseBlend;
import decorator.model.decorator.extend.Milk;
import decorator.model.decorator.extend.Mocha;
import decorator.model.decorator.extend.Soy;
import decorator.model.decorator.extend.Whip;

public class StarBuzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

        Beverage beverage4 = new Espresso();
        beverage4.setSize(Beverage.SIZE.VENTI);
        beverage4 = new Milk(beverage4);
        System.out.println(beverage4.getDescription() + " $" + beverage4.cost());

    }
}