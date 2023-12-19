package ex04;

public class MethodEx01 {

    static void m1() {
        System.out.println("m1");
    }

    static String m2() {
        System.out.println("m2");
        return "m2";//메서드 종료
    }

    public static void main(String[] args) {
        // 메서드는 실행시에 메서드 내부 ({} 사이)가 열림
        // m2메서드의 실행이 끝나면 "m2"로 바뀜
        m1();
        String result = m2();
        System.out.println("result : " + result);
    }
}