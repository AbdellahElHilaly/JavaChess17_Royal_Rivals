package com.youcode.docs.Timer;

import java.util.Timer;
import java.util.TimerTask;

public class JavaTimer {
    private Timer timer;
    private boolean isRunning;
    private long elapsedTime;

    public JavaTimer() {
        timer = new Timer();
        isRunning = false;
        elapsedTime = 0;
    }

    public void startTimer() {
        if (!isRunning) {
            timer.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    elapsedTime += 1000; // Increment elapsed time by 1 second (1000 milliseconds)
                    System.out.println("Elapsed Time: " + elapsedTime + " milliseconds");
                }
            }, 0, 1000); // Schedule the task to run every 1 second
            isRunning = true;
        }
    }

    public void stopTimer() {
        if (isRunning) {
            timer.cancel(); // Cancel the timer
            isRunning = false;
            System.out.println("Timer stopped.");
        }
    }

    public void pauseTimer() {
        if (isRunning) {
            timer.cancel(); // Cancel the timer (pause)
            isRunning = false;
            System.out.println("Timer paused. Elapsed Time: " + elapsedTime + " milliseconds");
        }
    }

    public void resumeTimer() {
        if (!isRunning) {
            timer = new Timer(); // Create a new timer
            startTimer(); // Start the timer again
            System.out.println("Timer resumed.");
        }
    }

    public static void main(String[] args) {
        JavaTimer myTimer = new JavaTimer();

        myTimer.startTimer();

        // Simulate some work being done
        try {
            Thread.sleep(5000); // Sleep for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        myTimer.pauseTimer();

        // Simulate some more work
        try {
            Thread.sleep(3000); // Sleep for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        myTimer.resumeTimer();

        // Simulate more work
        try {
            Thread.sleep(4000); // Sleep for 4 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        myTimer.stopTimer();
    }
}
