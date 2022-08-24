package factory.model.pizza.extend.chicago;

import factory.model.pizza.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        name = "시카고 야채 피자";
        dough = "시카고 야채 도우";
        sauce = "시카고 야채 소스";
        toppings.add("시카고 야채 치즈");
    }
    @Override
    public void cut() {
        System.out.println("시카고 야채 모양으로 피자 자르기");
    }
}
