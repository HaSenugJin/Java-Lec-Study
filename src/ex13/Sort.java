package ex13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        String[] sample = {"i", "walk", "the", "line"};
        List<String> l = Arrays.asList(sample); // 배열을 리스트로 변경
        Collections.sort(l); // 정렬 수행
        System.out.println(l);
    }
}
