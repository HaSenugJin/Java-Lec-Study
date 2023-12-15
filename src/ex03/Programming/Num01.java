package ex03.Programming;

import java.util.Scanner;

public class Num01 {
    public static void main(String[] args) {
        //사용자가 입력한 값이1, 2,.... , 9 이면 "ONE","TWO",...,"NINE"과 같이 출력하는 프로그램
        //아니면 OTHER을 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("1~9사이의 정수를 하나 입력: ");
        int user = sc.nextInt();

        if (user == 1) {
            System.out.println("ONE");
        } else if (user == 2) {
            System.out.println("TOW");
        } else if (user == 3) {
            System.out.println("THREE");
        } else if (user == 4) {
            System.out.println("FOUR");
        } else if (user == 5) {
            System.out.println("FIVE");
        } else if (user == 6) {
            System.out.println("SIX");
        } else if (user == 7) {
            System.out.println("SEVEN");
        } else if (user == 8) {
            System.out.println("EIGHT");
        } else if (user == 9) {
            System.out.println("NINE");
        } else {
            System.out.println("OTHER");
        }
    }
}