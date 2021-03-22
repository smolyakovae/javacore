package lesson1;

public class Human implements CanRun, CanJump {

    private int humanRun;
    private int humanJump;

    public Human (int humanRun, int humanJump){
        this.humanJump = humanJump;
        this.humanRun = humanRun;
    }

    @Override
    public void jump (int height) {
        if (humanJump > height) {
            System.out.println("Человек перепрыгнул");
        } else {
            System.out.println("Человек не перепрыгнул");
        }
    }

    @Override
    public void run (int length) {
        if (humanRun > length) {
            System.out.println("Человек пробежал");
        } else {
            System.out.println("Человек не пробежал");
        }
    }
}
