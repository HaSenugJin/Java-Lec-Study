package ex13;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("A");
        s.add("B");
        s.add("C");
        s.add("D");
        s.add("E");
        s.add("E");
        System.out.println(s);
        if (s.contains("E")) { // contains : 집합 안에 데이터가 있는지, 없는지의 여부를 boolean값으로 반환
            System.out.println("E도 포함되어 있음");
        }

        System.out.println();
        System.out.println("들어가 있는 값");
        for (String v : s) {
            System.out.print(v + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("s의 사이즈: " + s.size());
    }
}
