package ex06.example3;

public class StartApp {

    public static void gameStart(Zealot u1, Dragoon u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dragoon u1, Zealot u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Zealot u1, Zealot u2) {
        u1.attack();
        u2.attack();
    }

    public static void main(String[] args) {
        Zealot z1 = new Zealot();
        Zealot z2 = new Zealot();
        Dragoon d1 = new Dragoon();

        gameStart(z1, d1);
        System.out.println();
        gameStart(d1, z1);
        System.out.println();
        gameStart(z2, z1);
    }
}