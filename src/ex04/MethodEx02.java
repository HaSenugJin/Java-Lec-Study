package ex04;

public class MethodEx02 {

    static void m3(int n1) {
        System.out.println("m3 : " + n1);
    }

    //             파라미터(매개변수)
    static void m4(int n1, int n2) {
        System.out.print("m4 : " + n1 + " " + n2);
    }

    public static void main(String[] args) {
        m3(1);
        m4(1, 2); // 인수 -> 아규먼트
    }
}