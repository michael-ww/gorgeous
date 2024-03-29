package gorgeous.pattern.Creational;

public abstract class YellowHuman extends Human {

    @Override
    public void getColor() {
        System.out.println("Yellow Human Skin is Yellow!");

    }

    @Override
    public void talk() {
        System.out.println("Yellow Human can talk!");
    }
}
