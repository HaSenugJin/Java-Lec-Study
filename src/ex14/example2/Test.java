package ex14.example2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("kim", "park", "lee", "choi", "chee");


        List<String> sublist = list.stream(). // 스트림 생성
                filter(s -> s.startsWith("c")) // 스트림 처리
                .sorted() // 스트림 처리
                .collect(Collectors.toList()); // 결과 생성
        System.out.println(sublist); //결과 출력
    }
}
// [chee, choi]