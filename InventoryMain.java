import java.util.Scanner;

public class InventoryMain {
    public static void main(String[] args) throws Exception {
        Inventory inventory = new Inventory();
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add inventory");
            System.out.println("2. Buy inventory");
            System.out.println("3. Sell inventory");
            System.out.println("4. Display Inventory");
            System.out.println("5. Clear inventory");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String addName = input.nextLine();
                    System.out.print("Enter quantity: ");
                    int addQuantity = input.nextInt();
                    inventory.addItem(addName, addQuantity);
                    break;
                case 2:
                    System.out.print("Enter name: ");
                    String buyName = input.nextLine();
                    System.out.print("Enter quantity: ");
                    int buyQuantity = input.nextInt();
                    inventory.addItem(buyName, buyQuantity);
                    break;
                case 3:
                    System.out.print("Enter name: ");
                    String sellName = input.nextLine();
                    System.out.print("Enter quantity: ");
                    int sellQuantity = input.nextInt();
                    inventory.sellItem(sellName, sellQuantity);
                    break;
                case 4:
                    inventory.displayInventory();
                    break;
                case 5:
                    inventory.clearInventory();
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
    }
}
