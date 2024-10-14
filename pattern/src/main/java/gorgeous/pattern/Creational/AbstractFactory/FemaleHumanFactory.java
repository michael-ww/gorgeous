package gorgeous.pattern.creational.abstractfactory;

import gorgeous.pattern.Creational.FemaleBlackHuman;
import gorgeous.pattern.Creational.FemaleWhiteHuman;
import gorgeous.pattern.Creational.FemaleYellowHuman;
import gorgeous.pattern.Creational.Human;

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
