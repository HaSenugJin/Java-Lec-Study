package ex13;

import java.util.Vector;

class Monster {
    String name;
    double hp;
    public Monster(String name, double hp) {
        this.name = name;
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "{"
                + name+ ", " +
                + hp +
                "}";
    }
}

public class VectorExample2 {
    public static void main(String[] args) {
        Vector<Monster> v = new Vector<>();

        v.add(new Monster("Mon1", 100));
        v.add(new Monster("Mon2", 200));
        v.add(new Monster("Mon3", 300));

        System.out.println("벡터의 크기: " + v.size());
        System.out.print(v);
    }
}
