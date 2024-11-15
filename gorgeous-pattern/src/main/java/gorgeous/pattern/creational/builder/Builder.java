package gorgeous.pattern.creational.builder;

import gorgeous.pattern.creational.Human;

public abstract class Builder {
    public abstract void setPart();

    public abstract Human build();
}
