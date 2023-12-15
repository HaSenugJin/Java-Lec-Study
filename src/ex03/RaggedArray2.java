package ex03;

import java.util.Arrays;

public class RaggedArray2 {
    public static void main(String[] args) {
        int [][] rarray = new int[3][];
        rarray[0] = new int[]{1, 2, 3, 4};
        rarray[1] = new int[]{5, 6, 7};
        rarray[2] = new int[]{8, 9};

        for (int[] row: rarray) {
            System.out.println(Arrays.toString(row));
            //1차원 배열의 출력방식이다
            //2차원 배열은 이러면 참조값만 나옴
        }
    }
}
