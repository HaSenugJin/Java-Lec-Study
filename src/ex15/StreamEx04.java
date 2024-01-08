package ex15;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class StreamEx04 {
    public static void main(String[] args) {
        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(System.out)
        );

        try {
            // \n은 readLine에서 읽을 때 ;과 똑같다. 안써주면 못읽는다.
            // \n은 통신의 가장 마지막에 붙혀준다.
            bw.write("안녕\n"); // 내려쓰기 가능
            bw.write("반가워\n"); // readLine이 읽을 때, \n 을 끊어서 읽기 때문에 두 번 읽어줘야한다.
            bw.flush(); // 플러시 해줘야함 안해주면 출력이 안됌
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
