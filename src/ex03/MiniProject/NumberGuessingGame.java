package ex03.MiniProject;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int computer = (int) (Math.random() * 100);

        int a = 0;
        while (true)
        {
            System.out.print("정답을 추측하여 보시오: ");
            int user = sc.nextInt();
            if (computer == user) {
                a++;
                System.out.println("축하합니다. " + "시도횟수 = " + a);
                break;
            } else if (computer > user) {
                a++;
                System.out.println("제시한 정수가 컴퓨터의 정수보다 낮습니다.");
            } else {
                a++;
                System.out.println("제시한 정수가 컴퓨터의 정수보다 높습니다.");
            }
        }
    }
}