package ex04;

public class Television02 {
    int channel;
    int volume;
    boolean onOff;

    Television02(int x, int y, boolean o) {
        channel = x;
        volume = y;
        onOff = o;
    }

    void print() {
        System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
    }

    public static void main(String[] args) {
        Television02 myTv = new Television02(7, 10, true);
        myTv.print();

        Television02 yourTv = new Television02(11,20,true);
        yourTv.print();
    }
}