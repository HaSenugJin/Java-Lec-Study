package ex04;

//하나의 소스 파일안에 여러개의 클래스를 지정할 경우 하나의 클래스만 public으로 선언 되어야 함
class Box {
    int width;
    int length;
    int height;
    double getVoume() {
        return (double) width * length * height;
    }
}

public class BoxTest {
    public static void main(String[] args) {
        Box b;
        b = new Box();
        b.width = 20;
        b.length = 20;
        b.height = 30;
        System.out.println("상자의 가로, 세로, 높이는 " + b.width + ", " +
                b.length + ", " + b.height + "입니다.");
        System.out.println("상자의 부피는 " + b.getVoume() + "입니다.");
    }
}