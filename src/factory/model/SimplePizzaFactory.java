package factory.model;

import factory.model.pizza.Pizza;
import factory.model.pizza.extend.normal.CheesePizza;
import factory.model.pizza.extend.normal.ClamPizza;
import factory.model.pizza.extend.normal.PepperoniPizza;
import factory.model.pizza.extend.normal.VeggiePizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }else if(type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }else if(type.equals("clam")){
            pizza = new ClamPizza();
        }else if(type.equals("veggie")){
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
