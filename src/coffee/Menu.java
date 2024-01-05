package coffee;

import java.util.List;

public class Menu {
    private List<MenuItem> item;

    public Menu(List<MenuItem> item) {
        this.item = item;
    }

    // 아메리카노, 카푸치노, 마끼아또, 에스프레소
    public MenuItem choose(String name) {
        for (MenuItem each : item) {
            if (each.getName().equals(name)) {
                return each;
            }
        }

        return null;
    }
}