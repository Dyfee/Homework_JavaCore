package Homework1;

public class Wall extends Obstacle {
    protected int height;

    public Wall(int height) {
        this.height = height;
    }

    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}
