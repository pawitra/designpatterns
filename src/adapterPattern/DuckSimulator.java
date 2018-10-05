package adapterPattern;

import java.util.ArrayList;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck redhead = new RedheadDuck();
        Quackable rubber = new RubberDuck();

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
    }
}
