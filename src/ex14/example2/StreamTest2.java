package ex14.example2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Shop {
    private String s;
    private int p;

    private Scanner sc = new Scanner(System.in);

    public void s1(List<Product2> list) {
        System.out.println("상품을 검색하세요");
        System.out.print("상품의 이름(*은 모든상품을 의미): ");
        s = sc.next();
        System.out.println();
        System.out.print("상품의 가격 상한: ");
        p = sc.nextInt();
        System.out.println();

        List<String> result;
        if (s.equals("*")) {
            result = list.stream()
                    .filter(product2 -> product2.getPrice() <= p)
                    .map(Product2::getName2)
                    .collect(Collectors.toList());
            System.out.println("검색된 상품은" + result + "입니다.");
        } else {
            result = list.stream()
                    .filter(product2 -> product2.getName().equals(s))
                    .filter(product2 -> product2.getPrice() <= p)
                    .map(Product2::getName2)
                    .collect(Collectors.toList());
            System.out.println("검색된 상품은" + result + "입니다.");
        }
    }
}

class Product2 {
    private int id;
    private String name;
    private int price;
    private String name2;

    public Product2(int id, String name, int price, String name2) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.name2 = name2;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getName2() {
        return name2;
    }
}


public class StreamTest2 {
    public static void main(String[] args) {
        List<Product2> list = new ArrayList<>();
        list.add(new Product2(1, "컴퓨터", 150, "삼성 컴퓨터 모델 1번"));
        list.add(new Product2(2, "텔레비전", 100, "삼성 텔레비전 모델 1번"));
        list.add(new Product2(3, "냉장고", 200, "삼성 냉장고 모델 1번"));
        list.add(new Product2(4, "컴퓨터", 120, "삼성 컴퓨터 모델 2번"));
        list.add(new Product2(5, "텔레비전", 130, "삼성 텔레비전 모델 2번"));
        list.add(new Product2(6, "냉장고", 200, "삼성 냉장고 모델 2번"));
        list.add(new Product2(7, "컴퓨터", 210, "삼성 컴퓨터 모델 3번"));
        list.add(new Product2(8, "텔레비전", 180, "삼성 텔레비전 모델 3번"));
        list.add(new Product2(8, "냉장고", 250, "삼성 냉장고 모델 3번"));


        List<Product2> list2 = new ArrayList<>();
        list2.add(new Product2(1, "컴퓨터", 150, "삼성 컴퓨터 모델 1번"));
        list2.add(new Product2(2, "텔레비전", 100, "삼성 텔레비전 모델 1번"));
        list2.add(new Product2(3, "냉장고", 200, "삼성 냉장고 모델 1번"));
        list2.add(new Product2(4, "컴퓨터", 120, "삼성 컴퓨터 모델 2번"));
        list2.add(new Product2(5, "텔레비전", 130, "삼성 텔레비전 모델 2번"));
        list2.add(new Product2(6, "냉장고", 200, "삼성 냉장고 모델 2번"));
        list2.add(new Product2(7, "컴퓨터", 210, "삼성 컴퓨터 모델 3번"));
        list2.add(new Product2(8, "텔레비전", 180, "삼성 텔레비전 모델 3번"));
        list2.add(new Product2(8, "냉장고", 250, "삼성 냉장고 모델 3번"));

        Shop sh = new Shop();
        sh.s1(list2);
    }
}