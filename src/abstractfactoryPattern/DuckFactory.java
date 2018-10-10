package abstractfactoryPattern;

public class DuckFactory extends AbstractDuckFactory{

    @Override
    public Quackable addMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable addRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable addRubberDuck() {
        return new RubberDuck();
    }

}
