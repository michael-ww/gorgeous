package mnj.Creational.SimpleFactory;

import mnj.Creational.Human;

public class HumanFactory {
    public static <T extends Human> T createHuman(Class<T> cl) {
        Human human = null;
        try {
            human = (Human) Class.forName(cl.getName()).newInstance();
        } catch (Exception e) {
            // TODO: handle exception
        }
        return (T) human;
    }
}
