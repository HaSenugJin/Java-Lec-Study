package ex17.half;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;

// 반이중
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(20000);
            Socket socket = serverSocket.accept();
            // 소켓 연결 완료됨

            // 버퍼 생성
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream(), "UTF-8")
            );

            String requestMsg = br.readLine();
            System.out.println("클라이언트로부터 받은 메시지 : " + requestMsg);

            // 버퍼 만들기 (send)
            // 플러시 자동 (true)
            // UTF-8 자동
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);

            if (requestMsg.equals("1")) {
                pw.println("영화"); // \n 자동
            } else if (requestMsg.equals("2")) {
                pw.println("드라마");
            } else {
                pw.println("프로토콜을 확인하세요 : 1은 영화, 2는 드라마");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}