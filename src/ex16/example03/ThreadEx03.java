package ex16.example03;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThreadEx03 extends JFrame {
    private boolean state = true; // 스레드 제어는 상태값으로 제어함
    private boolean state2 = true; // 스레드 제어는 상태값으로 제어함
    private int count = 0;
    private int count2 = 0;
    private JLabel countLabel;
    private JLabel count2Label;

    public ThreadEx03() {
        setTitle("숫자 카운터 프로그램");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 레이아웃 매니저 설정
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // 숫자를 표시할 레이블 생성
        countLabel = new JLabel("숫자1: " + count);
        count2Label = new JLabel("숫자2: " + count2);
        countLabel.setAlignmentX(CENTER_ALIGNMENT);
        count2Label.setAlignmentX(CENTER_ALIGNMENT);
        add(countLabel);
        add(count2Label);

        // 멈춰 버튼 생성
        JButton increaseButton = new JButton("멈춰1");
        increaseButton.setAlignmentX(CENTER_ALIGNMENT);
        add(increaseButton);

        JButton increaseButton2 = new JButton("멈춰2");
        increaseButton2.setAlignmentX(CENTER_ALIGNMENT);
        add(increaseButton2);

        // 버튼에 액션 리스너 추가
        increaseButton.addActionListener(e -> {
            state = false; // 스레드를 멈추게 된다.
        });

        increaseButton2.addActionListener(e -> {
            state2 = false; // 스레드를 멈추게 된다.
        });

        setVisible(true);

        new Thread(() -> {
            while (state) {
                try {
                    Thread.sleep(1000); // 스레드를 잠시 멈춰서 끼어들 수 있게 하기
                    count++;
                    countLabel.setText("숫자1: " + count);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }).start();

        new Thread(() -> {
            while (state2) {
                try {
                    Thread.sleep(1000); // 스레드를 잠시 멈춰서 끼어들 수 있게 하기
                    count2++;
                    count2Label.setText("숫자2: " + count2);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }).start();
    }

    public static void main(String[] args) {
       new ThreadEx03();
    }
}