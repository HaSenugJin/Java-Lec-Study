package ex04;

class Box2 {
    //이자리에 기본 생성자가 생성됨
    int width, height, depth;

    public Box2(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }
}

public class BoxTeat {
    public static void main(String[] args) {
        Box2 b = new Box2(10,20,30);
        System.out.println(b.width + " " + b.height + " " + b.depth);
    }
}
