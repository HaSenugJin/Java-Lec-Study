package ex16;

import javax.swing.*;

public class CarGame extends JFrame {
    class MyThread extends Thread {
        private JLabel label;
        private int x, y;

        public MyThread(String fname, int x, int y) {
            this.x = x;
            this.y = y;
            label = new JLabel();
            label.setIcon(new ImageIcon(fname));
            label.setBounds(x, y, 100, 100);
            add(label);
        }

        public void run() {
            for (int i = 0; i < 200; i++) {
                x += 10 * Math.random();
                label.setBounds(x, y, 100, 100);
                repaint();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public CarGame() {
        setTitle("CarRace");
        setSize(600, 340);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        (new MyThread("D:\\01.png", 100, 0)).start();
        (new MyThread("D:\\02.png", 100, 100)).start();
        (new MyThread("D:\\03.png", 100, 200)).start();
        setVisible(true);
    }

    public static void main(String[] args) {
        CarGame c = new CarGame();
    }
}