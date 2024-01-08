package coffee;

import java.util.ArrayList;
import java.util.List;

public class CoffeeApp {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("아메리카노");
        l.add("카푸치노");
        l.add("카라멜마끼아또");
        l.add("에스프레소");

        Barista barista = new Barista(l);
        Customer customer = new Customer(barista);
        customer.order(l, barista);
        String a = barista.makeCoffee(l.get(0));
        System.out.println(a);
    }
}