package ex17.multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(30000);
        Socket socket = serverSocket.accept();

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