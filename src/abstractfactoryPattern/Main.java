package abstractfactoryPattern;

public class Main {
    public static void main(String[] args) {
        DuckSimulator duck = new DuckSimulator();

        AbstractDuckFactory duckCountFact = new DuckCountFactory();
        duck.addQuack(duckCountFact.addMallardDuck());
        duck.addQuack(duckCountFact.addRedheadDuck());
        duck.addQuack(duckCountFact.addRubberDuck());

        AbstractDuckFactory duckFact = new DuckFactory();
        duck.addQuack(duckFact.addMallardDuck());
        duck.addQuack(duckFact.addRedheadDuck());
        duck.addQuack(duckFact.addRubberDuck());

        AbstractDuckFactory countEchoFact = new DuckCountEchoFactory();
        duck.addQuack(countEchoFact.addMallardDuck());
        duck.addQuack(countEchoFact.addRedheadDuck());
        duck.addQuack(countEchoFact.addRubberDuck());
        duck.allQuack();

        System.out.println(QuackCountDecorator.getQuackCounter());
    }
}

