import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(String name, int quantity) {
        Item item = getItem(name);

        if (item == null) {
            items.add(new Item(name, quantity));
        }
        else {
            item.addQuantity(quantity);
        }
    }

    public void sellItem(String name, int quantity) {
        Item item = getItem(name);

        if (item != null && item.getQuantity() >= quantity) {
            item.subtractQuantity(quantity);
        }
        else {
            System.out.println("\nItem not found/insufficient quantity");
        }
    }

    public void displayInventory() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public void clearInventory() {
        if (items.size() > 0) {
            items.clear();
            System.out.println("\nInventory has been cleared."); 
        }
        else {
            System.out.println("\nInventory is already empty.");
        }
        
    }

    public Item getItem(String name) {
        for (Item item : items) {
            if(item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }
}
