package ex14.example1;

class User {
    private int id;
    private String name;
    private String tel;

    public User(int id, String name, String tel) {
        this.id = id;
        this.name = name;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "User{" +
                "id= " + id +
                ", name= '" + name + '\'' +
                ", tel= '" + tel + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }
}

public class CopyEx04 {
    public static void main(String[] args) {
        User u1 = new User(1, "ssar", "010-1111-2222");

        System.out.println(u1.toString());
        // 1. 통째로 복사
        User u2 = new User(u1.getId(), u1.getName(), u1.getTel());
        System.out.println(u2.toString());

        // 2. 구분 복사
        User u3 = new User(u1.getId(), u1.getName(), "010-2222-3333");
        System.out.println(u3.toString());
    }
}
