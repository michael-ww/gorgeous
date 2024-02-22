package mnj.Creational.AbstractFactory;

import mnj.Creational.Human;

public abstract class HumanFactory {
    public abstract Human createBlackHuman();

    public abstract Human createWhiteHuman();

    public abstract Human createYellowHuman();
}
