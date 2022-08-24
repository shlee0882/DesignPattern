package factory.model.pizza.extend.ny;

import factory.model.pizza.Pizza;

public class NyStyleClamPizza extends Pizza {
    public NyStyleClamPizza() {
        name = "뉴옥 조개 피자";
        dough = "뉴옥 조개 도우";
        sauce = "뉴옥 조개 소스";
        toppings.add("뉴옥 조개 치즈");
    }
}
