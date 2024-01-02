package ex08.example2;

class Cal2 {
    public void divide(int num) throws Exception {
        // 여기 try 문을 적으면 사용자가 바꿀 수 없음
        System.out.println(10 / num);
    }
}

public class TryEx01 {
    public static void main(String[] args) {
        Cal2 c2 = new Cal2();
        try {
            c2.divide(0);
        } catch (Exception e) {
            System.out.println("0으로 나눌 수 없음");
        }
    }
}