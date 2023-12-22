package ex06.Programming;

class A{
    public void A() {
        System.out.println("A");
    }
}

class B extends A{
    public void A() {
        System.out.println("B");
    }
}


public class Test {
    public static void main(String[] args) {
        A b = new A();
        b.A();

        A b1 = new B();
        b1.A();
    }
}
