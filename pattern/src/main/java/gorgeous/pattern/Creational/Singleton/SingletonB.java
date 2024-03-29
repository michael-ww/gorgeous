package gorgeous.pattern.Creational.Singleton;

import java.lang.reflect.Constructor;

public class SingletonB {
    private SingletonB() {
    }

    private static SingletonB singletonB;

    static {
        try {
            Class cl = Class.forName(SingletonB.class.getName());
            Constructor constructor = cl.getDeclaredConstructor();
            constructor.setAccessible(true);
            singletonB = (SingletonB) constructor.newInstance();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static SingletonB getSingletonB() {
        return singletonB;
    }
}
