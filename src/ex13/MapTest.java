package ex13;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        m.put("kim", "1234");
        m.put("park", "pass");
        m.put("lee", "word");

        System.out.println(m.get("lee")); // 키를 가지고 값을 참조한다.

        m.forEach((key, value) -> {
            System.out.println("key= "+key+", value= "+value);
        });

        m.remove("lee"); // 하나의 항목을 삭제한다.
        m.put("choi", "password"); // 하나의 항목을 대체한다.
        System.out.println(m);
    }
}
