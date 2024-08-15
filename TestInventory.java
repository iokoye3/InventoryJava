import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.*;

public class TestInventory {
    private Inventory inventory;

    @Before
    public void initialize() {
        inventory = new Inventory();
    }

     @Test
    public void testAddItem() {
        inventory.addItem("Apple", 10);
        assertEquals(10, inventory.getItem("Apple").getQuantity());

        inventory.addItem("Apple", 5);
        assertEquals(15, inventory.getItem("Apple").getQuantity());
    }

    @Test
    public void testSellItem() {
        inventory.addItem("Banana", 10);
        inventory.sellItem("Banana", 3);
        assertEquals(7, inventory.getItem("Banana").getQuantity());

        inventory.sellItem("Banana", 10); 
        assertEquals(7, inventory.getItem("Banana").getQuantity());
    }

    @Test
    public void testDisplayInventory() {
        inventory.addItem("Orange", 20);
        inventory.addItem("Grapes", 30);
        inventory.addItem("Mango", 15);

        String output = inventory.toString();
        
        assertNotNull(output.contains("Orange"));
        assertNotNull(output.contains("Grapes"));
        assertNotNull(output.contains("Mango"));

        assertEquals(20, inventory.getItem("Orange").getQuantity());
        assertEquals(30, inventory.getItem("Grapes").getQuantity());
        assertEquals(15, inventory.getItem("Mango").getQuantity());
    }

    @Test
    public void testClearInventory() {
        inventory.addItem("Pineapple", 5);
        inventory.addItem("Strawberry", 8);

        inventory.clearInventory();
        assertNull(inventory.getItem("Pineapple"));
        assertNull(inventory.getItem("Strawberry"));
    }

    @Test
    public void testFindItemByName() {
        inventory.addItem("Watermelon", 12);
        assertNotNull(inventory.getItem("Watermelon"));

        assertNull(inventory.getItem("NonExistentItem"));
    }
}
