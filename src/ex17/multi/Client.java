package ex17.multi;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            // 1. 소켓과 버퍼 만들기
            // 127.0.0.1 = localhost
            Socket socket = new Socket("localhost", 20000);
            Scanner sc = new Scanner(System.in);
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);

            // 2. 메시지 전송 스레드
            new Thread(() -> {
                while (true) {
                    String keyboardMsg = sc.nextLine();
                    pw.println(keyboardMsg);
                }
            }).start();

            // 3. 메시지 읽기 스레드


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}