package abstractfactoryPattern;

import java.util.ArrayList;

public class DuckSimulator {
    private ArrayList<Quackable> quackables = new ArrayList<>();

    public void addQuack(Quackable quackable) {
        quackables.add(quackable);
    }

    public void allQuack() {
        for (Quackable q: quackables){
            q.quack();
        }
    }
}
