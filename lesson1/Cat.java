package lesson1;

public class Cat implements CanRun, CanJump {
    private int catRun;
    private int catJump;

    public Cat (int catRun, int catJump){
        this.catJump = catJump;
        this.catRun = catRun;
    }


    @Override
    public void jump (int height) {
        if (catJump > height) {
            System.out.println("Кот перепрыгнул");
        } else {
            System.out.println("Кот не перепрыгнул");
        }
    }

    @Override
    public void run (int length) {
        if (catRun > length) {
            System.out.println("Кот пробежал");
        } else {
            System.out.println("Кот не пробежал");
        }
    }
}
