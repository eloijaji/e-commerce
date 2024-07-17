public class Main {
    public static void main(String[] args) {
        User user = new User("Asma EL OIJAJI", "asma.eloijaji@example.com");
        user.register();
        user.login();

        Product product1 = new Product("Makeup Brush", 1000, 1);
        Product product2 = new Product("Black Dress", 50, 2);

        Card card = new Card(user);
        card.addProduct(product1);
        card.addProduct(product2);

        card.checkout();

        Order order = new Order("12345");
        OrderObserver priceObserver = new PriceObserver();
        OrderObserver quantityObserver = new QuantityObserver();

        order.attach(priceObserver);
        order.attach(quantityObserver);


        order.addItem(500);
        order.addItem(150);

        order.detach(priceObserver);

        order.addItem(200);
    }
}
