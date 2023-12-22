package ex06.Programming;

class Circle {
    protected int radius;
    protected String p;

    public Circle(int r) {
        this.radius = r;
    }
}

public class PizzaTest extends Circle {
    public PizzaTest(String p, int r) {
        super(r);
        this.radius = r;
        this.p = p;
    }

    void print() {
        System.out.println("피자의 종류:" + this.p + "피자의 크기: " + this.radius);
    }

    public static void main(String[] args) {
        PizzaTest obj = new PizzaTest("Pepperoni ", 20);
        obj.print();
    }
}
