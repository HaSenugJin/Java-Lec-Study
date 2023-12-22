package ex06.MyExample;

class Shape02 {
    public double getArea() {
        return 0;
    }

    public Shape02() {
        super();
    }
}

class Rectangle02 extends Shape02 {
    private double width, height;

    public Rectangle02(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}

class Triangle02 extends Shape02 {
    private double base, height;

    public double getArea() {
        return 0.5 * base * height;
    }

    public Triangle02(double base, double height) {
        super();
        this.base = base;
        this.height = height;
    }
}
public class ShapeAreaTest {
    public static void main(String[] args) {
        Shape02 obj1 = new Rectangle02(10.0, 20.0);
        Shape02 obj2 = new Triangle02(10.0, 20.0);

        System.out.println("Rectangle02: " + obj1.getArea());
        System.out.println("Triangle02: " + obj2.getArea());
    }
}