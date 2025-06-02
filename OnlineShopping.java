
import java.util.*;

class User {
    private int userId;
    private String name;
    private Cart cart = new Cart();

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public Cart getCart() {
        return cart;
    }
}

class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.productId = id;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String getName() {
        return name;
    }
}

class Cart {
    private Map<Product, Integer> items = new HashMap<>();

    public void addProduct(Product product, int quantity) {
        items.put(product, items.getOrDefault(product, 0) + quantity);
    }

    public void removeProduct(Product product) {
        items.remove(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            total += entry.getKey().getPrice() * entry.getValue();
        }
        return total;
    }
}

class Order {
    private int orderId;
    private User user;
    private Cart cart;
    private String status;

    public Order(int orderId, User user, Cart cart) {
        this.orderId = orderId;
        this.user = user;
        this.cart = cart;
        this.status = "Pending";
    }

    public void placeOrder() {
        status = "Placed";
        System.out.println("Order placed successfully.");
    }

    public String getStatus() {
        return status;
    }
}
