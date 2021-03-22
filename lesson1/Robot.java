package lesson1;

public class Robot implements CanRun, CanJump {

    private int robotRun;
    private int robotJump;

    public Robot (int robotRun, int robotJump){
        this.robotJump = robotJump;
        this.robotRun = robotRun;
    }

    @Override
    public void jump (int height) {
        if (robotJump > height) {
            System.out.println("Робот перепрыгнул");
        } else {
            System.out.println("Робот не перепрыгнул");
        }
    }

    @Override
    public void run (int length) {
        if (robotRun > length) {
            System.out.println("Робот пробежал");
        } else {
            System.out.println("Робот не пробежал");
        }
    }
}
