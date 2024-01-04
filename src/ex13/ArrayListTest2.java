package ex13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int index = list.indexOf("C"); // ArrayList에 저장된 문자열을 검색한다.

        System.out.println("C의 저장위치: " + index);
    }
}
