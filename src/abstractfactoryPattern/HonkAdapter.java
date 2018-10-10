package abstractfactoryPattern;

public class HonkAdapter implements Quackable{
    private Honkable honkable;

    public HonkAdapter(Honkable honkable) {
        this.honkable = honkable;
    }

    @Override
    public void quack() {
        honkable.honk();
    }

}
