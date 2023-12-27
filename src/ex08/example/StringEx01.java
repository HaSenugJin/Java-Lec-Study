package ex08.example;

public class StringEx01 {

    public static String encoding(String data) {
        int count;


        return data;
    }

    public static String decoding(String encodingData) {
        return "";
    }

    public static void main(String[] args) {
        String data = "AABBBCCCCDDDDD"; // Byte -> 14Byte

        // 인코딩 A2B3C4D5
        int a = data.indexOf("A");
        int b = data.indexOf("B");
        int c = data.indexOf("C");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //if(data.equals("A"))


//        for (int i = 0; i < data.length(); i++) {
//            System.out.println(data.indexOf("A"));
//        }

        // 디코딩 AABBBCCCCDDDDD
    }
}