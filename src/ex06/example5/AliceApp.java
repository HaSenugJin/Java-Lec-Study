package ex06.example5;

// 오브젝트가 아니다. (new로 동적 할당 불가능)
// abstract를 넣어서 강제성을 부여함
// (재정의 할때 메서드의 이름이 다르면 오류를 띄우게 만듬)
abstract class 판사 { // abstract = 추상 클래스
    public abstract void 심문(); // 추상 오브젝트
}

abstract class 증인 {
    public abstract void 대답();
}

// 아래쪽부터는 오브젝트 이다.
class 왕 extends 판사 {
    public void 심문() {
        System.out.println("왕은 심문한다.");
    }
}

class 모자장수 extends 증인 {
    public void 대답() {
        System.out.println("모자장수는 대답한다.");
    }
}

class 왕비 extends 판사 {
    public void 심문() {
        System.out.println("왕비는 심문한다.");
    }
}

class 토끼 extends 증인 {
    public void 대답() {
        System.out.println("토끼는 대답한다.");
    }
}

class 앨리스 extends 증인 {

    public void 대답() {
        System.out.println("앨리스는 대답한다.");
    }
}

public class AliceApp {
    public static void main(String[] args) {
        판사 u1 = new 왕비(); // 판사, 왕비
        증인 u2 = new 토끼(); // 증인, 토끼

        u1.심문();
        u2.대답();
    }
}