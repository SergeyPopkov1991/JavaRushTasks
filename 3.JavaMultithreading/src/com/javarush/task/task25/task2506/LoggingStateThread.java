package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread{
    private Thread thread;

    public LoggingStateThread(Thread thread) {
        this.thread = thread;
        this.setDaemon(true);
    }

    @Override
    public void run() {
        State currentState = thread.getState();
        System.out.println(currentState);
        while (true) {
            State state = thread.getState();
            if (!currentState.equals(state)) {
                System.out.println(state);
                currentState = state;

            }else if (state.equals(State.TERMINATED)) break;

        }
    }
}
