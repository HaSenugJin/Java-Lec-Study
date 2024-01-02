package ex08.example2;

class Cal3 {
    // 예외처리 권한호출자에게 위임
    // Exception가 쓰여있으면 호출자가 예외처리 하지 않으면 오류를 발생시킴(발생시키는게 목적임)
    // RuntimeException가 쓰여있으면 오류를 발생 시키지는 않으나, 런타임 오류는 발생함
    // 사용하지 않아도 예외를 위임시키긴 하지만,
    // Exception를 씀으로써 사용자로 하여금 예외처리를 강제시킬 수 있음
    void divide(int num) throws Exception {
        System.out.println(10 / num);
    }
}

class Cal5 {
    // 예외처리를 직접담당함
    void divide(int num) {

        try {
            System.out.println(10 / num);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

public class TryEx05 {
    public static void main(String[] args) {

        Cal3 c3 = new Cal3();
        try {
            c3.divide(0);
        } catch (Exception e) {
            System.out.println("0으로 나누지 마요");
        }
    }
}