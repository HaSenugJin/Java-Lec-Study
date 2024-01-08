package coffee;

import java.util.List;

public class Customer {
    private Barista barista;

    public Customer(Barista barista) {
        this.barista = barista;
    }

    public void order(List<String> m, Barista barista) {
        barista.choose(m.get(0));
    }
}
