package factory.model.store.extend;

import factory.model.pizza.Pizza;
import factory.model.pizza.extend.ny.NyStyleCheesePizza;
import factory.model.pizza.extend.ny.NyStyleClamPizza;
import factory.model.pizza.extend.ny.NyStylePepperoniPizza;
import factory.model.pizza.extend.ny.NyStyleVeggiePizza;
import factory.model.store.PizzaStore;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        if(item.equals("cheese")){
            return new NyStyleCheesePizza();
        }else if(item.equals("veggie")){
            return new NyStyleVeggiePizza();
        }else if(item.equals("clam")){
            return new NyStyleClamPizza();
        }else if(item.equals("pepperoni")){
            return new NyStylePepperoniPizza();
        }else{
            return null;
        }
    }
}
