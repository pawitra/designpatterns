package abstractfactoryPattern;

public class QuackEchoDecorator implements Quackable{
    private Quackable duck;

    public QuackEchoDecorator(Quackable duck) {
        this.duck = duck;
    }


    @Override
    public void quack() {
        duck.quack();
        System.out.print("echo : ");
        duck.quack();
    }

}
