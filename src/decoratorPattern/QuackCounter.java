package decoratorPattern;

import java.util.ArrayList;

public class QuackCounter implements Quackable{
    private Quackable quackables;
    private static int count;

    public QuackCounter(Quackable quackables) {
        this.quackables = quackables;
    }

    @Override
    public void quack() {
            quackables.quack();
            count++;
    }

    public static int getCount() {
        return count;
    }
}
