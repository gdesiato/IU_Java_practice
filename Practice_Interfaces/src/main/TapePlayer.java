package main;

public class TapePlayer implements Recorder {

    @Override
    public void play() {
        System.out.println("the tape is playing");
    }

    @Override
    public void stop() {
        System.out.println("the tape has been stopped");
    }

    @Override
    public void pause() {
        System.out.println("the tape is paused");
    }

    @Override
    public void reverse() {
        System.out.println("the is reversed");
    }

    @Override
    public void record() {
        System.out.println("the tape is recording");
    }
}
