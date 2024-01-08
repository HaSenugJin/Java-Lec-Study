package ex14.example2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println("입력데이터 = " + num);
        List<Integer> result = num.stream().filter(n -> {
            return n % 2 == 0;
        }).map(n -> {
            return n * n;
        }).collect(Collectors.toList());
        System.out.println(result);
    }
}
// 입력데이터 = [1, 2, 3, 4, 5, 6, 7, 8]
// [4, 16, 36, 64]