package factory.model.pizza.extend.ny;

import factory.model.pizza.Pizza;

public class NyStyleVeggiePizza extends Pizza {
    public NyStyleVeggiePizza() {
        name = "뉴옥 야채 피자";
        dough = "뉴옥 야채 도우";
        sauce = "뉴옥 야채 소스";
        toppings.add("뉴옥 야채 치즈");
    }
}
