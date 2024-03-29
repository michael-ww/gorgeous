package gorgeous.pattern.Creational.FactoryMethod;

import gorgeous.pattern.Creational.Human;

public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> cl);
}
