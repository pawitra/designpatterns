package abstractfactoryPattern;

public class DuckCountFactory extends AbstractDuckFactory{
    @Override
    public Quackable addMallardDuck() {
        return new QuackCountDecorator(new MallardDuck());
    }

    @Override
    public Quackable addRedheadDuck() {
        return new QuackCountDecorator(new RedheadDuck());
    }

    @Override
    public Quackable addRubberDuck() {
        return new QuackCountDecorator(new RubberDuck());
    }

}
