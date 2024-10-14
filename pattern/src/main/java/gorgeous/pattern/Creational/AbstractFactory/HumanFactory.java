package gorgeous.pattern.creational.abstractfactory;

import gorgeous.pattern.Creational.Human;

public abstract class HumanFactory {

    public abstract Human createBlackHuman();

    public abstract Human createWhiteHuman();

    public abstract Human createYellowHuman();
}
