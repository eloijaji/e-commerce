import java.util.ArrayList;
import java.util.List;


public class Card {
    private List<Product> products = new ArrayList<>();
    private User user;
    private double totalPrice;
    private double shippingCost;

    public Card(User user) {
        this.user = user;
    }

    public void addProduct(Product product) {
        products.add(product);
        calculateTotalPrice();
        calculateShippingCost();
    }

    public void removeProduct(Product product) {
        products.remove(product);
        calculateTotalPrice();
        calculateShippingCost();
    }

    public double calculateTotalPrice() {
        totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice() * product.getQuantity();
        }
        return totalPrice;
    }

    public double calculateShippingCost() {
        shippingCost = totalPrice > 100 ? 0 : 10;
        return shippingCost;
    }

    public void checkout() {
        // Logique de validation
        System.out.println("Checkout completed. Total Price: " + totalPrice + ", Shipping Cost: " + shippingCost);
    }

    public List<Product> getProducts() {
        return products;
    }

    public User getUser() {
        return user;
    }
}
