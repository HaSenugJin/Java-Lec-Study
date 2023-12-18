package ex04;

public class Circle {
    private int radius;

    //생성자
    //생성될 때 무조건 실행됨
    //안적으면 자동으로 생성됨
    //new로 동적할당하면 생성자를 말하는것
    //최초값 세팅(초기화)
    public Circle(int r) {
        radius = r;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }
}