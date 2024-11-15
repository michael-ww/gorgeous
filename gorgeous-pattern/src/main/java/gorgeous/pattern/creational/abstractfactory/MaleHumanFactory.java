package gorgeous.pattern.creational.abstractfactory;

import gorgeous.pattern.creational.Human;
import gorgeous.pattern.creational.MaleBlackHuman;
import gorgeous.pattern.creational.MaleWhiteHuman;
import gorgeous.pattern.creational.MaleYellowHuman;

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
