package lesson1;

public class RunningTrack {
    private int length;

    public RunningTrack (int length){
        this.length = length;
    }
    public void checkRun (CanRun runner) {
        runner.run(length);
    }
}
