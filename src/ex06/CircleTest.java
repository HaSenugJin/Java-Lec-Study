package ex06;

// 부모가 있다면 부모 생성자를 호출하여 힙에 먼저 띄운다
class Shape {
    int x, y;

    public Shape() {
        System.out.println("Shape 생성됨");
    }
}

class Circle extends Shape {
    int radius; // 반지름

    public Circle(int radius) {
        System.out.println("Circle 생성됨");
        this.radius = radius;
        super.x = 0; // 자식이 부모에게 접근할때 super.를 쓴다
        super.y = 0;
    }

    double getArea() {
        return 3.14 * radius * radius;
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        circle.getArea();
    }
}
