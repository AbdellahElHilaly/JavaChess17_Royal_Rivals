package com.youcode.app.ui.component.text;

import com.youcode.app.ui.guide.AppComponent;
import com.youcode.app.shared.config.TextConfig;
import com.youcode.docs.Timer.SwingTimer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerView extends JLabel implements AppComponent {

    private final Timer timer = new Timer(10, new TimerActionListener());
    private long elapsedTime = 0;
    private boolean isRunning = false;

    public TimerView() {
        super("00:00:00:00");
        init();
    }

    @Override
    public void setStyle() {
        setFont(TextConfig.Timer.FONT);
        setForeground(TextConfig.Timer.FOREGROUND);
    }

    @Override
    public void build() {
        setVerticalAlignment(SwingConstants.CENTER);
        setOpaque(false);
    }

    @Override
    public void addComponents() {
    }

    public void reset() {
        setText("00:00:00:00");
    }

    public void setMarginLeft(int marginLeft) {
        setBorder(new EmptyBorder(0, marginLeft, 0, 0));
    }
    public void setMarginRight(int marginRight) {
        setBorder(new EmptyBorder(0, 0, 0, marginRight));
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
        long milliseconds = (elapsedTime % 1000) / 10;

        String timeString = String.format("%02d:%02d:%02d:%02d", hours, minutes, seconds, milliseconds);

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                setText(timeString);
            }
        });
    }

    public void startCount() {
        startTimer();
    }

    public Timer pauseCount() {
        pauseTimer();
        return timer;
    }

    private class TimerActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            elapsedTime += 10;
            updateTimerLabel();
        }
    }
}
