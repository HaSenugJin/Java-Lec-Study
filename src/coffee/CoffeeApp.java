package coffee;

import java.util.ArrayList;
import java.util.List;

public class CoffeeApp {
    public static void main(String[] args) {
        String a = "아메리카노";
        Barista barista = new Barista();
        Customer customer = new Customer(barista);
        List<MenuItem> l = new ArrayList<>();
        Menu m = new Menu(l);
        MenuItem menuItem = new MenuItem("아메리카노");
        String me = menuItem.getName();

        System.out.println(me);
        customer.order(a, m);
    }
}