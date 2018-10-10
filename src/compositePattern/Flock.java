package compositePattern;

import java.util.ArrayList;

public class Flock {
    private ArrayList<Quackable> quackables = new ArrayList<>();

    public void addQuack(Quackable quackable) {
        quackables.add(quackable);
    }

    public void Quack() {
        quackables.get(0).quack();
        quackables.get(0).quack();
        for (Quackable q: quackables){
            q.quack();
        }
    }

}
