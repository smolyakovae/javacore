package lesson1;

public class Main {

    public static void main(String[] args) {
       RunningTrack track = new RunningTrack(200);
        Wall wall = new Wall(200);
        Cat cat = new Cat(250, 250);
        Human human = new Human(100, 100);
        track.checkRun(cat);
        wall.CheckJump(cat);
        System.out.println("_______"); // здесь просто отделяю первую часть задания от второй в консоли

        Wall[] walls = {new Wall(300), new Wall(250), new Wall(150)};
        Cat[] cats = {new Cat(100, 100), new Cat(200, 200), new Cat(400, 400)};
        int i = 0;
        for (Wall Wall : walls){
            Wall.CheckJump(cats[i]);
            i++;
        }

    }
}
