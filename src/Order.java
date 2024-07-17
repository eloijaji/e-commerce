import java.util.ArrayList;
import java.util.List;


public class Order {
    private List<OrderObserver> observers = new ArrayList<>();
    private double totalPrice;
    private int itemCount;
    private double shippingCost;
    private String id;

    public Order(String id) {
        this.id = id;
    }

    public void attach(OrderObserver observer) {
        observers.add(observer);
    }

    public void detach(OrderObserver observer) {
        observers.remove(observer);
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getItemCount() {
        return itemCount;
    }

    public String getId() {
        return id;
    }

    public String toString() {
        return "Order ID: " + id + ", Total Price: " + totalPrice + ", Item Count: " + itemCount;
    }

    public void addItem(double price) {
        itemCount++;
        totalPrice += price;
        notifyObservers();
    }

    private void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(this);
        }
    }
}
