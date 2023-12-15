package ex03.test;

public class BubbleTest01 {

    static void bubble(int[] arr) {
        final int N = arr.length;
        int temp;

        for (int loop = 1; loop < 5; loop++) {
            for (int i = 0; i < N-loop; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};
        BubbleTest01.bubble(arr);
    }
}