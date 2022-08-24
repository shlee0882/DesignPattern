package factory.model.store.extend;

import factory.model.pizza.Pizza;
import factory.model.pizza.extend.chicago.ChicagoStyleCheesePizza;
import factory.model.pizza.extend.chicago.ChicagoStyleClamPizza;
import factory.model.pizza.extend.chicago.ChicagoStylePepperoniPizza;
import factory.model.pizza.extend.chicago.ChicagoStyleVeggiePizza;
import factory.model.store.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        if(item.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }else if(item.equals("veggie")){
            return new ChicagoStyleVeggiePizza();
        }else if(item.equals("clam")){
            return new ChicagoStyleClamPizza();
        }else if(item.equals("pepperoni")){
            return new ChicagoStylePepperoniPizza();
        }else{
            return null;
        }
    }
}
