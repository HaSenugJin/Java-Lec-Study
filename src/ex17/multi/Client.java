package ex17.multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 30000);

        new Thread(() -> {
            try {
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(socket.getInputStream(), "UTF-8")
                );

                while (true) {
                    String requestMsg = br.readLine();

                    System.out.println(requestMsg);
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }).start();

        new Thread(() -> {
            try {
                while (true) {
                    Scanner sc = new Scanner(System.in);
                    String responseMsg = sc.nextLine();
                    PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
                    pw.println(responseMsg);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }
}