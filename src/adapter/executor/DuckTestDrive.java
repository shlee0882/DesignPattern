package adapter.executor;

import adapter.model.duck.MallardDuck;
import adapter.model.itf.Duck;
import adapter.model.itf.Turkey;
import adapter.model.adapter.TurkeyAdapter;
import adapter.model.turkey.WildTurkey;

public class DuckTestDrive {
    public static void main(String[] args){
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("\n칠면조가 말하길");
        turkey.gobble();
        turkey.fly();

        System.out.println("\n오리가 말하길");
        testDuck(duck);

        System.out.println("\n칠면조 어댑터가 말하길");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
