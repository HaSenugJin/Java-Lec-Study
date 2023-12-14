package ex03;

public class ArrEx01 {
    public static void main(String[] args) {
        int[] arr = new int[3]; //int 를 세번써서 12byte

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }
    }
}