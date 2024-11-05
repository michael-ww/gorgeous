package gorgeous.pattern.creational;

public abstract class BlackHuman extends Human {

    @Override
    public void getColor() {
        System.out.println("Black Human Skin is Black!");
    }

    @Override
    public void talk() {
        System.out.println("Black Human can talk!");
    }

}
