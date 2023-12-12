package ex01;

public class VarEx01 {

    //모든 코드는 main 메서드 내부에 적는다.
    public static void main(String[] args) {
        int n1 = 1; //정수형 변수 -21 ~ 21까지 저장가능 (4byte)
        double d1 = 1.5; //실수형 변수 21억까지 (8byte)
        long big1 = 20L; //정수형 변수 경까지 저장 가능(8byte) 정수 뒤에 대문자 넣기
        boolean b1 = true; //true, false 만 저장함 (1bit) 실제로는 1과 0만 들어감
        char c1 = '가'; //''안에 문자 하나만 저장
        String s1 = "가나다";

        //변수에 값을 저장하지 않으면, null 값이 들어간다.
        //int a; = NULL

        System.out.println(n1);
        System.out.println(d1);
        System.out.println(big1);
        System.out.println(b1);
        System.out.println(c1);
    }// 자바 프로그램 종료(main 시작부터 끝)
}
