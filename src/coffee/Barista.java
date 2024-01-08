package coffee;

import java.util.List;

public class Barista {
    private Menu m;
    private List<String> item;

    public Barista(List<String> item) {
        this.item = item;
    }

    // 아메리카노, 카푸치노, 마끼아또, 에스프레소
    public String choose(String name) {
        for (String each : item) {
            if (each.equals(name)) {
                return each;
            }
        }
        return null;
    }

    public String makeCoffee(String m) {
        return m;
    }
}