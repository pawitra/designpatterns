package abstractfactoryPattern;

public class QuackCountDecorator implements Quackable{
    private static int quackCounter = 0;
    private Quackable duck;

    public QuackCountDecorator(Quackable duck) {
        this.duck = duck;
    }

    public static int getQuackCounter() {
        return quackCounter;
    }

    @Override
    public void quack() {
        duck.quack();
        quackCounter++;
    }

}
