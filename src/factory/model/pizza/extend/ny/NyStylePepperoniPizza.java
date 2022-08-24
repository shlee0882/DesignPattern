package factory.model.pizza.extend.ny;

import factory.model.pizza.Pizza;

public class NyStylePepperoniPizza extends Pizza {
    public NyStylePepperoniPizza(){
        name = "뉴옥 페퍼로니 피자";
        dough = "뉴옥 페퍼로니 도우";
        sauce = "뉴옥 페퍼로니 소스";
        toppings.add("뉴옥 페퍼로니 치즈");
    }
}
