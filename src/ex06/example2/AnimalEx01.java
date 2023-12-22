package ex06.example2;

class Animal {
    void speak() {
        System.out.println("멍멍");
    }

    void run() {
        System.out.println("달린다");
    }
}

class Cat extends Animal {

    // 재정의
    void speak() {
        System.out.println("야옹");
    }
}

public class AnimalEx01 {
    public static void main(String[] args) {
        Animal c1 = new Cat(); // 다형성[Cat, Animal], 동적 바인딩
        c1.speak();
        c1.run();
    }
}