package ls1;

public class Robot implements Movements {

    private String name;
    private int runDistance;
    private int jumpHeight;

    public Robot(String name, int distance, int jumpHeight) {
        this.name = name;
        this.runDistance = distance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
        System.out.println("Robot " + this.name + " is running " + this.getRunDistance());
    }

    @Override
    public void jump() {
        System.out.println("Robot " + this.name + " is jumping " + this.getJumpHeight());
    }

    public int getRunDistance() {
        return this.runDistance;
    }

    public int getJumpHeight() {
        return this.jumpHeight;
    }
}
