package gorgeous.pattern.Creational.AbstractFactory;

import gorgeous.pattern.Creational.Human;

public abstract class HumanFactory {
    public abstract Human createBlackHuman();

    public abstract Human createWhiteHuman();

    public abstract Human createYellowHuman();
}
