package Menuusages;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

public class TimeUpdater {
    private JLabel timeLabel;
    private Timer timer;

    public TimeUpdater(JLabel timeLabel) {
        this.timeLabel = timeLabel;
        timer = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LocalTime now = LocalTime.now();
                int hour = now.getHour();
                int minute = now.getMinute();
                int second = now.getSecond();
                String time = String.format("%02d:%02d:%02d", hour, minute, second);
                timeLabel.setText(time);
            }
        });
    }

    public void start() {
        timer.start();
    }
}
