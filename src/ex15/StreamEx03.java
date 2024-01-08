package ex15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class StreamEx03 {
    public static void main(String[] args) {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        try {
            String line = br.readLine(); // \n 까지만 읽음
            System.out.println(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}