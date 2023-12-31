package ex06.MyExample;

class Shape {
    protected int x, y;

    public void draw() {
        System.out.println("Shape Draw");
    }
}

class Rectangle extends Shape {
    private int base, height;

    public void draw() {
        System.out.println("Rectangle Draw");
    }
}

class Triangle extends Shape {
    private int base, height;

    public void draw() {
        System.out.println("Triangle Draw");
    }
}

class Circle extends Shape {
    private int radius;

    public void draw() {
        System.out.println("Circle Draw");
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        Shape s2 = new Rectangle();

        s1.draw();
        s2.draw();
    }
}
