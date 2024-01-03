package ex13.example01;

class Box<T> {
    T date;
}

public class GenericEx01 {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        Box<Integer> box2 = new Box<>();

        box1.date = "1";
        box2.date = 1;

        System.out.println(box1.date);
        System.out.println(box2.date);
    }
}
