package mnj.Creational.AbstractFactory;

import mnj.Creational.FemaleBlackHuman;
import mnj.Creational.FemaleWhiteHuman;
import mnj.Creational.FemaleYellowHuman;
import mnj.Creational.Human;

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
