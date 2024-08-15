public class Item {
    private String name;
    private int quantity;

    public Item (String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void addQuantity(int value) {
        this.quantity += value;
    }

    public void subtractQuantity(int value) {
        this.quantity -= value;
    }

    public String toString() {
        return "{" +
            "name='" + name + '\'' +
            ", quantity=" + quantity +
            '}';
    }
}
