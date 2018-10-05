package decoratorPattern;

public class QuackEco implements Quackable {
    private Quackable quackables;

    public QuackEco(Quackable quackables) {
        this.quackables = quackables;
    }
    @Override
    public void quack() {
        quackables.quack();
        System.out.print("Eco: ");
        quackables.quack();
    }
}
