package ex13.exmaple05;

class Model<T> {
    private T data;

    public void setDate(T date) {
        this.data = date;
    }

    public T getDate() {
        return data;
    }
}

class User {
    public int id = 1;
    public String name = "홍길동";
    public String email = "ssar@naver.com";

    public void hello() {
        System.out.println("안녕하세요");
    }
}

public class GenericEx05 {
    public static void main(String[] args) {
        // Model을 User타입(클래스)으로 제네릭 하였음
        Model<User> m = new Model<>();
        // Model의 date에 User를 동적 할당함
        m.setDate(new User());

        User u = m.getDate();
        u.hello();
    }
}
