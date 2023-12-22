package ex06;

class Shape02 {
    public void draw() {
        System.out.println("Shape");
    }
}

class Circle02 extends Shape02 {
    public void draw() {

        System.out.println("Circle02");
    }
}

class Rectangle extends Shape02 {
    public void draw() {
        System.out.println("Rectangle");
    }
}

class Triangle extends Shape02 {
    public void draw() {
        super.draw();
        System.out.println("Triangle");
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.draw();
    }
}
