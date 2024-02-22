package mnj.Behavioral.Template;

public class Cricket extends Game {

    @Override
    public void start() {
        System.out.println("Cricket Start");
    }

    @Override
    public void end() {
        System.out.println("Cricket End");
    }

    @Override
    public void pause() {
        System.out.println("Cricket Pause");
    }

    @Override
    public boolean isPause() {
        return false;
    }

}
