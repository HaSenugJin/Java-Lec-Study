package coffee;

public class CoffeeApp {
    public static void main(String[] args) {
        Barista barista = new Barista();
        Customer customer = new Customer(barista);
        MenuItem menuItem = new MenuItem("아메리카노");
        Menu menu = new Menu("아메리카노");

        //customer.order(menuItem, );
    }
}