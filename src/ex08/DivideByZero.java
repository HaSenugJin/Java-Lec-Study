package ex08;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int result = 0;
        try {
            result = 10 / num;
        } catch (Exception e) {
//            System.out.println("0으로 나눌 수 없음");
//            System.out.println(e.getMessage());
//            System.out.println(e.getClass());
//            e.printStackTrace(); // 에러 메시지
            throw new RuntimeException("0으로 나눌 수 없음");
        }

        System.out.println(result);
    }
}