package ex14.example1;

import java.time.LocalDateTime;
import java.util.Locale;

// Data Transfer Object
class JoinDTO {
    private String username; // ssar(id)
    private String password;
    private String email;

    public JoinDTO(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

class Member {
    private int no = 1; // 1, 2, 3 ...
    private String username; // ssar(id)
    private String password;
    private String email;
    private LocalDateTime createApp; // 생성 시간 (날짜) 찍히게 하기;

    public Member(int no, JoinDTO dto) {
        this.no = no;
        this.username = dto.getUsername();
        this.password = dto.getPassword();
        this.email = dto.getEmail();
        this.createApp = createApp;
    }

    @Override
    public String toString() {
        return "Member{" +
                "no=" + no +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", createApp=" + createApp +
                '}';
    }
}

public class CopyEx05 {
    public static void main(String[] args) {
        JoinDTO d1 = new JoinDTO("ssar", "1234", "ssar@nate.com");
        JoinDTO d2 = new JoinDTO("cos", "1234", "cos@nate.com");

        //현재 시간
        LocalDateTime now = LocalDateTime.now();

        //joindto(d1, d2)를 member에 옮기기
        Member m1 = new Member(1, d1);
        Member m2 = new Member(2, d2);

        System.out.println(m1.toString());
        System.out.println(m2.toString());
    }
}