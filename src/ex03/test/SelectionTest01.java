package ex03.test;

public class SelectionTest01 {
    public static void main(String[] args) {
        int[] set = {9, 6, 7, 3, 5, 1, 8};
        final int N = set.length;
        int rep;
        int min;

        for (int i = 0; i < N - 1; i++) {
            rep = i;
            min = rep;
        }

//        temp = set[0];
//        set[0] = set[count+1];
//        set[count+1] = temp;
//        count = 0;
//
//
//        for (int i = 2; i < N; i++) {
//            if(temp > set[i])
//            {
//                temp = set[i];
//                count++;
//            }
//        }
//
//        temp = set[1];
//        set[1] = set[count+2];
//        set[count+2] = temp;
//
//        for (int i = 3; i < N; i++) {
//            if (temp > set[i]) {
//                temp = set[i];
//                count++;
//            }
//        }
//
//        temp = set[2];
//        set[2] = set[count + 2];
//        set[count + 2] = temp;
//
//        for (int i = 4; i < N; i++) {
//            if (temp > set[i]) {
//                temp = set[i];
//                count++;
//            }
//        }
//
//        temp = set[3];
//        set[3] = set[count + 2];
//        set[count + 2] = temp;
//
//
        for (int i = 0; i < N; i++) {
            System.out.print(set[i] + " ");
        }
    }
}
