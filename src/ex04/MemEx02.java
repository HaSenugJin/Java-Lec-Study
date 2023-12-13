package ex04;

class Person2 {
    int age = 10;
    char gender = '남';
}

public class MemEx02 {
    public static void main(String[] args) {
        System.out.println("1년 지남");
        System.out.println("2년 지남");
        System.out.println("3년 지남");

        //new = 동적할당
        //heap에 띄움
        Person2 p = new Person2();

        //출력
        System.out.println(p.age);
        System.out.println(p.gender);

        System.out.println("main 종료");
    }
}