package ex02;

public class CastEx01 {
    public static void main(String[] args) {
        int n1 = 1;
        double d1 = 1.5;

        n1 = 2;

        //업 캐스팅
        d1 = n1;
        System.out.println(d1);//2.0

        //다운 캐스팅
        n1 = (int) d1;
        System.out.println(n1);//2
    }
}