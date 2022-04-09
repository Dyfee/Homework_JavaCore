package Homework1;

public class Human implements Competitor {
    String name;
    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;
    boolean onDistance;

    public boolean isOnDistance() {
        return onDistance;
    }

    public Human(String name) {
        this.name = name;
        this.maxRunDistance = 5000;
        this.maxJumpHeight = 20;
        this.maxSwimDistance = 500;
        this.onDistance = true;
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " " + "successfully completed the cross");
        } else {
            System.out.println(name + " " + "couldn`t cross");
            onDistance = false;
        }
    }

    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " " + "successfully completed the jump");
        } else {
            System.out.println(name + " " + "couldn`t jump");
            onDistance = false;
        }
    }

    public void swim(int distance) {
        if (distance <= maxSwimDistance) {
            System.out.println(name + " " + "successfully completed the swim");
        } else {
            System.out.println(name + " " + "couldn`t swim the distance");
            onDistance = false;
        }
    }

    public void showResult() {
        System.out.println(name + ": " + onDistance);
    }
}
