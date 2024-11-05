package gorgeous.pattern.creational.factorymethod;

import gorgeous.pattern.creational.Human;

public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> cl);
}
