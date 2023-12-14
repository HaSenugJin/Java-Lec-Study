package ex03;

import java.util.Scanner;

public class GugudanEx02 {
    public static void main(String[] args) {
        //스캐너를 이용하여 입력받은 단만 출력.
        Scanner sc = new Scanner(System.in);

        int user;
        System.out.print("1~9사이의 숫자를 입력: ");
        user = sc.nextInt();

        System.out.println(user + "단만 출력");

        for (int i = 1; i < 10; i++) {
            System.out.println(user + " * " + i + " = " + user * i);
        }
    }
}