package CreationalPatterns.Prototype;

public abstract class Order {
    private int quantity;

    public Order(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "quantity=" + quantity +
                '}';
    }

    public abstract Order clone();
}
