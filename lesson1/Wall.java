package lesson1;

public class Wall {

    public int height;

    public Wall (int height){
        this.height = height;
    }

public void CheckJump (CanJump jumper) {
    jumper.jump(height);
}
}
