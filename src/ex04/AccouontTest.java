package ex04;

class Account {
    //필드가 모두 private로 선언되었으니 클래스 내부에서만 사용가능
    private int regNumber;
    private String name;
    private int balance;

    //접근자와 설정자를 사용
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getBalance() {return balance;}
    public void setBalance(int balance) {this.balance = balance;}
}

public class AccouontTest {
    public static void main(String[] args) {
        Account obj = new Account();
        obj.setName("Tom");
        obj.setBalance(100000);
        System.out.println("이름은 " + obj.getName() + " 통잔 잔고는 " + obj.getBalance() + "입니다.");
    }
}
