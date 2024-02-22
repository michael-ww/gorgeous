package mnj;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import mnj.Creational.FemaleYellowHuman;
import mnj.Creational.MaleBlackHuman;

/**
 * Unit test for simple App.
 */
public class CreationalPatternTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CreationalPatternTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(CreationalPatternTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }

    public void testSingleton() {
        mnj.Creational.Singleton.SingletonA.getInstance().process();
    }

    public void testSimpleFactory() {
        FemaleYellowHuman femaleYellowHuman = mnj.Creational.SimpleFactory.HumanFactory
                .createHuman(FemaleYellowHuman.class);
        femaleYellowHuman.getColor();
        femaleYellowHuman.getGender();
        femaleYellowHuman.talk();
    }

    public void testFactoryMethod() {
        mnj.Creational.FactoryMethod.AbstractHumanFactory humanFactory = new mnj.Creational.FactoryMethod.ConcreteHumanFactory();
        MaleBlackHuman maleBlackHuman = humanFactory.createHuman(MaleBlackHuman.class);
        maleBlackHuman.getColor();
        maleBlackHuman.getGender();
        maleBlackHuman.talk();
    }

    public void testAbstractFactory() {
        mnj.Creational.AbstractFactory.HumanFactory maleHumanFactory = new mnj.Creational.AbstractFactory.MaleHumanFactory();
        mnj.Creational.Human maleBlackHuman = maleHumanFactory.createBlackHuman();
        maleBlackHuman.getColor();
        maleBlackHuman.getGender();
        maleBlackHuman.talk();

        mnj.Creational.Human maleWhiteHuman = maleHumanFactory.createWhiteHuman();
        maleWhiteHuman.getColor();
        maleWhiteHuman.getGender();
        maleWhiteHuman.talk();

        mnj.Creational.Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        maleYellowHuman.getColor();
        maleYellowHuman.getGender();
        maleYellowHuman.talk();

        mnj.Creational.AbstractFactory.HumanFactory femaleHumanFactory = new mnj.Creational.AbstractFactory.FemaleHumanFactory();
        mnj.Creational.Human femaleBlackHuman = femaleHumanFactory.createBlackHuman();
        femaleBlackHuman.getColor();
        femaleBlackHuman.getGender();
        femaleBlackHuman.talk();

        mnj.Creational.Human femaleWhiteHuman = femaleHumanFactory.createWhiteHuman();
        femaleWhiteHuman.getColor();
        femaleWhiteHuman.getGender();
        femaleWhiteHuman.talk();

        mnj.Creational.Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
        femaleYellowHuman.getColor();
        femaleYellowHuman.getGender();
        femaleYellowHuman.talk();
    }
}
