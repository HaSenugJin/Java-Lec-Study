package ex17.half;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            // 127.0.0.1 = localhost
            Socket socket = new Socket("localhost", 20000);

            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);

            pw.println("2");

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream(), "UTF-8")
            );

            String responseMsg = br.readLine();
            System.out.println("서버로 부터 받은 메시지 : " + responseMsg);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
