package abstractfactoryPattern;

public class CooAdapter implements Quackable{
    private Cooable cooable;

    public CooAdapter(Cooable cooable) {
        this.cooable = cooable;
    }

    @Override
    public void quack() {
        cooable.coo();
        cooable.coo();
    }
}
