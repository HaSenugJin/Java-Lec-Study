package ex15;

import java.io.*;

// 상대 경로 : 내 파일(프로젝트폴더)에 위치를 기반으로 경로를 정하는 것
// 절대 경로 : 루트에서 부터 경로를 찾는것
// 윈도우 에서 경로 찾는법 : C:\workspace\hello.txt, 자바에서 \는 뒤에 문자를 무시하기 때문에 \\두개써야함
// 맥, 리눅스 에서 경로 찾는법 : /workspace/hello.txt
public class StreamEx05 {
    public static void main(String[] args) throws IOException {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            //inputStream = new BufferedReader(new FileReader("D:\\workspace\\java_lec\\study\\out\\production\\study\\ex15\\input.txt"));
            inputStream = new BufferedReader(new FileReader
                    ("src\\ex15\\input.txt"));
            outputStream = new PrintWriter(new FileWriter
                    ("src\\ex15\\output.txt"));
            String i;
            while ((i = inputStream.readLine()) != null) {
                outputStream.println(i);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}