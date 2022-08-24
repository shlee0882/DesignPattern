package factory.model.pizza.extend.chicago;

import factory.model.pizza.Pizza;

public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        name = "시카고 조개 피자";
        dough = "시카고 조개 도우";
        sauce = "시카고 조개 소스";
        toppings.add("시카고 조개 치즈");
    }
    @Override
    public void cut() {
        System.out.println("시카고 조개 모양으로 피자 자르기");
    }
}
