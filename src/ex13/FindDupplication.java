package ex13;

import java.util.HashSet;
import java.util.Set;

public class FindDupplication {
    public static void main(String[] args) {
        Set<String> list = new HashSet<>();
        String[] sample = {"사과", "사과", "바나나", "토마토"};
        for (String a : sample) {
            if (!list.add(a)) { // 집합에 추가되지 않으면 중복된 단어이다.
                System.out.println("중복된 단어: " + a);
            }
        }

        System.out.println(list.size() + "중복되지 않은 단어" + list);
    }
}
