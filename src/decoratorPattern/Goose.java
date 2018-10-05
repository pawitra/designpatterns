package decoratorPattern;

public class Goose implements Honkable {

    @Override
    public void honk() {
        System.out.println("honk");
    }
}
