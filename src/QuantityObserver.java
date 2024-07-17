public class QuantityObserver implements OrderObserver {
    public void update(Order order) {
        System.out.println("Item count updated to: " + order.getItemCount());
    }
}
