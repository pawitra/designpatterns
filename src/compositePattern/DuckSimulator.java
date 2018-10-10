package compositePattern;

public class DuckSimulator {
    public static void main(String[] args) {
        Flock flock = new Flock();

        AbstractDuckFactory duckCountFact = new DuckCountFactory();
        flock.addQuack(duckCountFact.addMallardDuck());
        flock.addQuack(duckCountFact.addRedheadDuck());
        flock.addQuack(duckCountFact.addRubberDuck());

        AbstractDuckFactory duckFact = new DuckFactory();
        flock.addQuack(duckFact.addMallardDuck());
        flock.addQuack(duckFact.addRedheadDuck());
        flock.addQuack(duckFact.addRubberDuck());

        AbstractDuckFactory countEchoFact = new DuckCountEchoFactory();
        flock.addQuack(countEchoFact.addMallardDuck());
        flock.addQuack(countEchoFact.addRedheadDuck());
        flock.addQuack(countEchoFact.addRubberDuck());

        flock.Quack();
        System.out.println(QuackCountDecorator.getQuackCounter());
    }

}
