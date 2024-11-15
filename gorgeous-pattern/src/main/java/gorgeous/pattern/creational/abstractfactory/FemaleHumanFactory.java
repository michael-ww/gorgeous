package gorgeous.pattern.creational.abstractfactory;

import gorgeous.pattern.creational.FemaleBlackHuman;
import gorgeous.pattern.creational.FemaleWhiteHuman;
import gorgeous.pattern.creational.FemaleYellowHuman;
import gorgeous.pattern.creational.Human;

public class FemaleHumanFactory extends HumanFactory {

    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

}
