package ex03;

class GugudanUtil {
    static void gugudan(int x) {
        for (int i = 1; i <= 9; i++) {
            System.out.println(x + "*" + i + " = " + (x * i));
        }
        System.out.println();
    }
}

public class GuGudanEx04 {
    public static void main(String[] args) {

        GugudanUtil.gugudan(3);
    }
}