package ex02;

import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //조건 연산자에 사용할 변수선언
        int x, a;
        double  d, cTemp, fTemp;

        //오류 나니까 초기화
        cTemp = 0.0f;
        fTemp = 0.0f;

        System.out.println("=========================");
        System.out.println("1. 화씨->섭씨");
        System.out.println("2. 섭씨->화씨");
        System.out.println("=========================");

        System.out.println("번호를 선택하시오: ");
        a = sc.nextInt();

        //변수 x에 a의 값을 1과 같은지 비교하여 x변수에 1 또는 2를 넣는다
        x = (a == 1) ? 1 : 2;

        //변수 x의 값이 1이면 사용자가 마치 화씨온도를 입력받는것처럼 꾸밈 2면 그반대
        System.out.println((x == 1)? "화씨온도를 입력하시오: " : "섭씨온도를 입력하시오: ");
        d = sc.nextDouble();

        //(0°F − 32) × 5/9 = -17.78°C 화씨 -> 섭씨
        //(0°C × 9/5) + 32 = 32°F 섭씨 -> 화씨
        cTemp = (d - 32) * 5 / 9;
        fTemp = (d * 9 / 5) + 32;

        System.out.println((x == 1)? "섭씨온도는 " + cTemp : "화씨온도는 " + fTemp);
    }
}