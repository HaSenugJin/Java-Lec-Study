package ex05;

public class Test02 {
    static int number;
    static String s;
    static {
        number = 23;
        s = "Hello World";
    }

    public static void main(String[] args) {
        System.out.println("number: " + number);
        System.out.println("s: " + s);
    }
}
