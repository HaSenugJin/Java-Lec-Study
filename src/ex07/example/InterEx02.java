package ex07.example;

interface EventListener {
    void action();
}

class MyApp {
    public void click(EventListener l) {
        l.action();
    }
}

public class InterEx02 {
    public static void main(String[] args) {
        MyApp app = new MyApp();
        app.click(() -> {
            System.out.println("회원가입 로직이 실행됩니다.");
        });
    }
}