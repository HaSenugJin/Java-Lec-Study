package ex03.Programming;

import java.util.Scanner;

public class Num02 {
    public static void main(String[] args) {
        //사용자로부터 사칙연산자를 문자로 입력 받은 후에 숫자 두개를 입력받은후
        //입력받은 사칙연산자로 두 수의 값을 구하는 프로그램 작성
        Scanner sc = new Scanner(System.in);

        String str = null;
        System.out.print("사칙 연산자(+, -, *, %, /)를 하나 입력하여 주십시오: ");
        str = sc.next();

        int num1, num2;
        System.out.print("첫 번째 정수를 입력하여 주십시오: ");
        num1 = sc.nextInt();

        System.out.print("두 번째 정수를 입력하여 주십시오: ");
        num2 = sc.nextInt();

        int sum;
        if (str.equals("+")) {
            sum = num1 + num2;
            System.out.println(sum);
        } else if (str.equals("-")) {
            sum = num1 - num2;
            System.out.println(sum);
        } else if (str.equals("*")) {
            sum = num1 * num2;
            System.out.println(sum);
        } else if (str.equals("%")) {
            if(num1 == 0)
            {
                System.out.println("분모가 0입니다.");
            } else {
                sum = num1 % num2;
                System.out.println(sum);
            }
        } else if (str.equals("/")) {
            sum = num1 / num2;
            System.out.println(sum);
        } else {
            System.out.println("올바르지 않은 사칙연산자 입니다.");
        }
    }
}