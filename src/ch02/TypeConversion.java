package ch02;

public class TypeConversion {
    public static void main(String[] args) {
        int i;
        double f;

        f = 1 / 5;
        System.out.println(f);
        //1 / 5는 피연산자가 정수이므로 정수 연산으로 계산되어 0이 됨
        //double형에 대입 되면서 올림 변환이 발생하여 0.0이 f에 저장됨.

        f = (double) 1 / 5;
        System.out.println(f);
        //1과 5둘다 형변환 되어 계산되니 값이 0.2가됨

        i = (int) 1.7 + (int) 1.8;
        System.out.println(i);
        //소수점을 가진 값을 정수형으로 변환하면 소수점을 버리게된다.
        //1.7과 1.8이 int형으로 형변환 될때 소수점 7과 8은 버려짐 값은 1 + 1인 2가됨
    }
}
