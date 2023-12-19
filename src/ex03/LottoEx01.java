package ex03;

import java.util.Arrays;
import java.util.Random;

public class LottoEx01 {
    public static void main(String[] args) {
        int arr[] = new int[6];
        Random r = new Random();
        final int N = arr.length;
        int num;

        for (int i = 0; i < N; i++) {
            if (i == 0) {
                num = r.nextInt(6) + 1;
                arr[i] = num;
            } else {
                while (true) {
                    num = r.nextInt(6) + 1;
                    if (arr[i - 1] != num) {
                        if (arr[i] != num) {
                            arr[i] = num;
                            break; // 가장 가까운 반복문을 빠져나옴
                        }
                    }
                }
            }
        }

        // 배열 안에 있는거 보여줌
        System.out.println(Arrays.toString(arr));
    }
}