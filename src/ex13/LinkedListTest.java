package ex13;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        //첫 번째
        list.add("A");
        list.add("B");
        list.add("C");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println();

        //두 번째
        list.add(1, "D"); // 인덱스 1에 "D"를 삽입
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println();

        //세 번째
        list.set(2, "E"); // 인덱스 2의 원소를 "E"로 대체
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println();

        //네 번째
        list.remove(3); // 인덱스 3의 원소를 삭제.
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
