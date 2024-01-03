package ex16;

import javax.swing.*;
import java.awt.*;

public class CountDownTest extends JFrame {
    private JLabel label;
    private int i;
    class MyThread extends Thread {
        public void run() {
            while (true) {
                try {
                    i++;
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                label.setText(i + "");
            }
        }
    }

    public CountDownTest() {
        setTitle("카운트다운");
        setSize(400, 150);
        label = new JLabel("Start");
        label.setFont(new Font("Start", Font.BOLD, 100));
        add(label);
        setVisible(true);
        (new MyThread()).start(); // 스레드를 시작
    }

    public static void main(String[] args) {
        CountDownTest t = new CountDownTest();
    }
}
