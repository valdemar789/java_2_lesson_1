package ls1;

public class Road implements Obstacle{
    private int length;

    public Road(String name, int length) {


    }

    public int getLength() {
        return length;
    }


    protected boolean moving(Human human) {
        System.out.println("The road " + "human" + " length: " + this.length);

        human.run();

        if (getLength() <= human.getRunDistance()) {
            System.out.println("Human run success");

            return true;
        } else {
            System.out.println("Human run unsuccessfully");

            return false;
        }
    }


    protected boolean moving(Robot robot) {
        System.out.println("The road " + "robot" + "length: " + this.length);

        robot.run();

        if (getLength() <= robot.getRunDistance()) {
            System.out.println("Robot run success");

            return true;
        } else {
            System.out.println("Robot run unsuccessfully");

            return false;
        }
    }


    protected boolean moving(Cat cat) {
        System.out.println("The road " + "cat" + "length: " + this.length);

        cat.run();

        if (getLength() <= cat.getRunDistance()) {
            System.out.println("Cat run success");

            return true;
        } else {
            System.out.println("Cat run unsuccessfully");

            return false;
        }
    }

}
