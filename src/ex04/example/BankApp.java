package ex04.example;

import ex04.example.model.Account;
import ex04.example.model.User;

public class BankApp {
    public static void main(String[] args) {
        // 1. 고객 두명 만들기
        User ssar = new User(1, "ssar", "ssar@gmail.com");
        User cos = new User(2, "cos", "cos@gmail.com");
        User love = new User(2, "love", "love@gmail.com");

        // 2. 계좌 두개 만들기
        Account ssarAccount = new Account(1111, 1000L, 1);
        Account cosAccount = new Account(2222, 1000L, 2);
        Account loveAccount = new Account(3333, 1000L, 3);

        // 3. 고객에게 정보를 받기 (sender, receiver, amount)
        long amount = 100L; // 이체할 돈

        // 4. 이체(하승진 -> 홍길동 100원)
        BankService.이체(cosAccount, loveAccount, amount);

        System.out.println(cosAccount);
        System.out.println(loveAccount);

        // 5. 출금
        BankService.출금(ssarAccount, 100L);
        System.out.println(ssarAccount);
    }
}