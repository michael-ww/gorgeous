package gorgeous.pattern.Creational.FactoryMethod;

import gorgeous.pattern.Creational.Human;

public class ConcreteHumanFactory extends AbstractHumanFactory {

    @Override
    public <T extends Human> T createHuman(Class<T> cl) {
        Human human = null;
        try {
            human = (Human) Class.forName(cl.getName()).newInstance();
        } catch (Exception e) {
            // TODO: handle exception
        }
        return (T) human;
    }

}
