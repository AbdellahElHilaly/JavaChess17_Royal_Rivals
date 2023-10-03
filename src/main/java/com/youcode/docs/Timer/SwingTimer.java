package com.youcode.docs.Timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingTimer {
    private JFrame frame;
    private JPanel panel;
    private Timer timer;
    private long elapsedTime;
    private boolean isRunning;
    private JLabel timerLabel;

    public SwingTimer() {
        frame = new JFrame("Swing Timer Example");
        panel = new JPanel();
        timer = new Timer(10, new TimerActionListener()); // Update every 10 milliseconds
        elapsedTime = 0;
        isRunning = false;

        createUI();
    }

    private void createUI() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        timerLabel = new JLabel("Elapsed Time: 00:00:00:00");
        panel.add(timerLabel);

        JButton startButton = new JButton("Start");
        JButton pauseButton = new JButton("Pause");
        JButton resumeButton = new JButton("Resume");
        JButton stopButton = new JButton("Stop");
        JButton restartButton = new JButton("Restart");

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startTimer();
            }
        });

        pauseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pauseTimer();
            }
        });

        resumeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resumeTimer();
            }
        });

        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stopTimer();
            }
        });

        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                restartTimer();
            }
        });

        panel.add(startButton);
        panel.add(pauseButton);
        panel.add(resumeButton);
        panel.add(stopButton);
        panel.add(restartButton);

        frame.add(panel);
        frame.setVisible(true);
    }

    private void startTimer() {
        if (!isRunning) {
            timer.start();
            isRunning = true;
        }
    }

    private void pauseTimer() {
        if (isRunning) {
            timer.stop();
            isRunning = false;
        }
    }

    private void resumeTimer() {
        if (!isRunning) {
            timer.start();
            isRunning = true;
        }
    }

    private void stopTimer() {
        timer.stop();
        isRunning = false;
        updateTimerLabel();
    }

    private void restartTimer() {
        stopTimer();
        elapsedTime = 0;
        updateTimerLabel();
    }

    private void updateTimerLabel() {
        long hours = (elapsedTime / 3600000) % 24;
        long minutes = (elapsedTime / 60000) % 60;
        long seconds = (elapsedTime / 1000) % 60;
        long milliseconds = (elapsedTime % 1000) / 10; // Display two digits for milliseconds

        String timeString = String.format("%02d:%02d:%02d:%02d", hours, minutes, seconds, milliseconds);
        timerLabel.setText("Elapsed Time: " + timeString);
    }


    private class TimerActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            elapsedTime += 10; // Update elapsed time every 10 milliseconds
            updateTimerLabel();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingTimer();
            }
        });
    }
}
