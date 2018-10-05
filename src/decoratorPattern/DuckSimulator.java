package decoratorPattern;

import java.util.ArrayList;

public class DuckSimulator {
    public static void main(String[] args) {
        QuackEco mallard = new QuackEco(new QuackCounter(new MallardDuck()));
        QuackEco redhead = new QuackEco(new QuackCounter(new RedheadDuck()));
        QuackEco rubber = new QuackEco(new QuackCounter(new RubberDuck()));

        GooseAdapter goose = new GooseAdapter(new Goose());
        PigeonAdapter pigeon = new PigeonAdapter(new Pigeon());

        ArrayList<Quackable> list = new ArrayList<>();

        list.add(mallard);
        list.add(redhead);
        list.add(rubber);
        list.add(goose);
        list.add(pigeon);

        for (Quackable q: list){
            q.quack();
        }

        System.out.println(QuackCounter.getCount());

    }
}
