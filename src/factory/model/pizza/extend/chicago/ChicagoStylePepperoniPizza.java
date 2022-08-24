package factory.model.pizza.extend.chicago;

import factory.model.pizza.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        name = "시카고 페퍼로니 피자";
        dough = "시카고 페퍼로니 도우";
        sauce = "시카고 페퍼로니 소스";
        toppings.add("시카고 페퍼로니 치즈");
    }
    @Override
    public void cut() {
        System.out.println("시카고 페퍼로니 모양으로 피자 자르기");
    }
}
