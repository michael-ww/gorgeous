package gorgeous.pattern.Creational.AbstractFactory;

import gorgeous.pattern.Creational.Human;
import gorgeous.pattern.Creational.MaleBlackHuman;
import gorgeous.pattern.Creational.MaleWhiteHuman;
import gorgeous.pattern.Creational.MaleYellowHuman;

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
