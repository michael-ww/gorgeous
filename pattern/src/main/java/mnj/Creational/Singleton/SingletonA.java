package mnj.Creational.Singleton;

public class SingletonA {
    private SingletonA() {
    }

    private volatile static SingletonA instance;

    public static SingletonA getInstance() {
        if (instance == null) {
            synchronized (SingletonA.class) {
                if (instance == null) {
                    instance = new SingletonA();
                }
            }
        }
        return instance;
    }

    public void process() {
        System.out.println("Singleton");
    }
}
