package abstractfactoryPattern;

public class DuckCountEchoFactory extends AbstractDuckFactory{
    @Override
    public Quackable addMallardDuck() {
        return new QuackCountDecorator(new QuackEchoDecorator(new MallardDuck()));
    }

    @Override
    public Quackable addRedheadDuck() {
        return new QuackCountDecorator(new QuackEchoDecorator(new RedheadDuck()));
    }

    @Override
    public Quackable addRubberDuck() {
        return new QuackCountDecorator(new QuackEchoDecorator(new RubberDuck()));
    }

}
