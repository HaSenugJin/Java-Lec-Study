package ex04;

//커스텀 자료형
//static
class Person1 {
    static int age = 20;
    static char gender = '여';
}

public class MemEx01 {
    public static void main(String[] args) {
        System.out.println(Person1.age);
        System.out.println(Person1.gender);
    }
}