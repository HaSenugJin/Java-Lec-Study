package ex03;

public class GugudanEx01 {
    public static void main(String[] args) {
        //2~9단까지 출력되는 프로그램

        for (int x = 1; x < 10; x++)
        {
            for (int i = 2; i < 10; i++) {
                System.out.print(i + " * " + x +" = " + x * i + "\t");
            }
            System.out.println();
        }
    }
}