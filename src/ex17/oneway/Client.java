package ex17.oneway;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client { // 요청
    public static void main(String[] args) {
        // localhost = 127.0.0.1 (루프백)
        try {
            Socket socket = new Socket("127.0.0.1", 10000);

            // 보조 스트림 : socket.getOutputStream()
            // 버퍼 : OutputStreamWriter
            BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream(),
                            "UTF-8")
            );

            bw.write("msg1" + "\n");
            bw.write("msg2" + "\n");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}