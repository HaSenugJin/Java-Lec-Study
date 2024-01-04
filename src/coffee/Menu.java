package coffee;

import java.util.List;

public class Menu {
    private String item;

    public Menu(String item) {
        this.item = item;
    }

    // 아메리카노, 카푸치노, 마끼아또, 에스프레소
    public MenuItem choose(String name) {
        for (int i = 0; i < item.length(); i++) {
            String each = item[i];
            if (each.equals(name)) {
                return each;
            }
        }
        return null;
    }
}