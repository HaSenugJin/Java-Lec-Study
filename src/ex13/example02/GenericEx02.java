package ex13.example02;

class Box {
    static Object date;
}

public class GenericEx02 {
    public static void main(String[] args) {
        Box.date = 1;
        Box.date = "문자";
    }
}
