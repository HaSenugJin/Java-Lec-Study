package ex13;

import java.util.Collections;
import java.util.Vector;

public class VectorExample1 {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<>();
        vec.add("Apple");
        vec.add("Orange");
        vec.add("Mango");

        // 크기
        System.out.println(vec.size());

        // 인덱스 접근
        System.out.println(vec.get(1));

        // 오름차순 정렬
        Collections.sort(vec);
        for (String s : vec) {
            System.out.print(s + " ");
        }

        System.out.println();

        // 내림차순 정렬
        Collections.sort(vec, Collections.reverseOrder());
        for (String s : vec) {
            System.out.print(s + " ");
        }

        // 정렬 다른 방법
        // Arrays.sort(); // 배열 정렬

        System.out.println();

        // 특전 번지에 있는 데이터를 삭제
        String result = vec.remove(2);
        System.out.println(result); // 삭제된 데이터가 나옴
        System.out.println(vec.size()); // 삭제 된건지 사이즈를 알아봄 (3에서 2가됨)

        // 값 찾기
        boolean search = vec.contains("Mango");
        System.out.println(search); // true(찾음)
    }
}