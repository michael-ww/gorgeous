package mnj.Creational.FactoryMethod;

import mnj.Creational.Human;

public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> cl);
}
