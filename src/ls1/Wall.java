package ls1;

public class Wall implements Obstacle {

    private int heigth;
    public Wall(String name, int heigth) {


    }

    public int getHeigth() {
        return heigth;
    }


    protected boolean moving(Human human) {
        System.out.println("The wall " + "human" + "heigth: " + this.heigth);

        human.jump();

        if (getHeigth() <= human.getJumpHeight()) {
            System.out.println("Human jump success");

            return true;
        } else {
            System.out.println("Human jump unsuccessfully");

            return false;
        }
    }


    protected boolean moving(Robot robot) {
        System.out.println("The wall " + "robot" + "heigth: " + this.heigth);

        robot.jump();

        if (getHeigth() <= robot.getJumpHeight()) {
            System.out.println("Robot jump success");

            return true;
        } else {
            System.out.println("Robot jump unsuccessfully");

            return false;
        }
    }


    protected boolean moving(Cat cat) {
        System.out.println("The wall " + "cat" + " heigth: " + this.heigth);

        cat.jump();

        if (getHeigth() <= cat.getJumpHeight()) {
            System.out.println("Cat jump success");

            return true;
        } else {
            System.out.println("Cat jump unsuccessfully");

            return false;
        }
    }
}
