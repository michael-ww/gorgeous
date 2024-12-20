package gorgeous.pattern.creational;

public abstract class WhiteHuman extends Human {

    @Override
    public void getColor() {
        System.out.println("White Human Skin is Black!");
    }

    @Override
    public void talk() {
        System.out.println("White Human can talk!");
    }
}
