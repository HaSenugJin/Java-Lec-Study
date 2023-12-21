package ex05;
//싱글톤 패턴 = 객체를 한번만 메모리에 띄우는 패턴
// President를 메모리에 한번만 띄울거임
class President {
    static President instance = new President();

    private President() {

    }
}

public class SingleTonEx01 {
    public static void main(String[] args) {

        //hashCode = 메모리 주소
        President p1 = President.instance;
        System.out.println(p1.hashCode());

        President p2 = President.instance;
        System.out.println(p2.hashCode());
    }
}