package coffee;

public class Customer {
    private Barista barista;

    public Customer(Barista barista) {
        this.barista = barista;
    }

    public void order(String menuName, Menu menu) {
        MenuItem menuItem = menu.choose(menuName);
        Coffee coffee = barista.makeCoffee(menuItem);
    }
}