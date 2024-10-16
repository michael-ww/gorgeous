package gorgeous.pattern.creational.builder;

import gorgeous.pattern.Creational.Human;

public abstract class Builder {
    public abstract void setPart();

    public abstract Human build();
}
