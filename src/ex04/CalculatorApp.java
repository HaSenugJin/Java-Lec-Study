package ex04;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int result = cal.add(50, 80);
        System.out.println("더하기 : " + result);

        int result2 = cal.minus(10, 2);
        System.out.println("빼기 : " + result2);

        int result3 = cal.divide(10, 2);
        System.out.println("나누기 : " + result3);

        int result4 = cal.multi(5, 2);
        System.out.println("곱하기 : " + result4);
    }
}