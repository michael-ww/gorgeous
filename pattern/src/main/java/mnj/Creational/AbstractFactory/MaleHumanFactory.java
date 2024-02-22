package mnj.Creational.AbstractFactory;

import mnj.Creational.Human;
import mnj.Creational.MaleBlackHuman;
import mnj.Creational.MaleWhiteHuman;
import mnj.Creational.MaleYellowHuman;

public class MaleHumanFactory extends HumanFactory {

    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }
}
