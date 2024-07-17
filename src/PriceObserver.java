public class PriceObserver implements OrderObserver {

    public void update(Order order) {
        System.out.println("Price updated to: " + order.getTotalPrice());
    }
}
