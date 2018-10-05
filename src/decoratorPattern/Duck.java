package decoratorPattern;

public class Duck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
