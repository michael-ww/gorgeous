package gorgeous.pattern.behavioral.template;

public class Football extends Game {

    @Override
    public void start() {
        System.out.println("Football Start");
    }

    @Override
    public void end() {
        System.out.println("Football End");
    }

    @Override
    public void pause() {
        System.out.println("Football Pause");
    }

    @Override
    public boolean isPause() {
        return true;
    }

}
