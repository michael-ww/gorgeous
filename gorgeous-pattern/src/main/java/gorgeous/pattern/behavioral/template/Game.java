package gorgeous.pattern.behavioral.template;

public abstract class Game {
    public abstract void start();

    public abstract void end();

    public abstract void pause();

    public abstract boolean isPause();

    public void play() {
        this.start();
        if (this.isPause()) {
            this.pause();
        }
        this.end();
    }
}
