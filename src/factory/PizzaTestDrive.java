package factory;

import factory.model.pizza.Pizza;
import factory.model.store.PizzaStore;
import factory.model.store.extend.ChicagoPizzaStore;
import factory.model.store.extend.NYPizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args){
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("뉴욕 치즈 애호가가 주문한" + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("뉴욕 페퍼로니 애호가가 주문한" + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("시카고 야채 애호가가 주문한" + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("시카고 조개 애호가가 주문한" + pizza.getName() + "\n");
    }
}
