package ex04;

//설계도
class Person4 {
    // 접근 제어자
    // private = 다른 클래스에서 접근을 할 수 없게 만듬
    //상태 = 변수
    private int weight = 100;

    //값을 확인하는 메서드
    public int getWeight() {
        return weight;
    }

    // public = 다른 클래스에서 접근 가능
    // 행위 = 메서드
    public void exercise() {
        weight = weight - 10;
    }
}

public class OOPEx02 {
    public static void main(String[] args) {
        Person4 p4 = new Person4();
        System.out.println(p4.getWeight());

        for (int i = 0; i < 10; i++) {
            p4.exercise();
        }

        System.out.println(p4.getWeight());
    }
}