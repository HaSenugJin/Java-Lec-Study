package ex06.example6;

class Protoss {

}

class Zealot extends Protoss {
    public void attack() {
        System.out.println("질럿이 공격합니다.");
    }
}

class Dragoon extends Protoss {
    public void attack() {
        System.out.println("드라군이 공격합니다.");
    }
}

public class CastingEx01 {
    public static void start(Protoss p) {
        // instanceof = 메모리에 떠 있는 타입을 검사한다.
        if (p instanceof Zealot) {
            Zealot u = (Zealot) p; // 부모를 자식에게 대입할 수 없다.
            u.attack();
        }

        if (p instanceof Dragoon) {
            Dragoon u = (Dragoon) p;
            u.attack();
        }
    }

    public static void main(String[] args) {
        start(new Zealot());
        start(new Dragoon());
    }
}
