import java.util.ArrayList;
import java.text.NumberFormat;

class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public CoffeeKiosk() {
        menu = new ArrayList<Item>();
        orders = new ArrayList<Order>();
    }

    public void addMenuItem(Item item) {
        menu.add(item);
        item.setIndex(menu.size() - 1);
    }

    public void displayMenu() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        for (Item item : menu) {
            System.out.printf("%.0f: %s -- %s%n", item.getIndex(), item.getName(), formatter.format(item.getPrice()));
        }
    }

    public void newOrder() {

        // Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Welcome to the Coffee Kiosk!");
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
        System.out.println("Welcome, " + name +"!");
        // Your code:
        // Create a new order with the given input string
        // Show the user the menu, so they can choose items to add.
        displayMenu();

        // Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        

        if (!itemNumber.equals("q")) {
            Order order = new Order(name);
            boolean found = false;
            // Write a while loop to collect all user's order items
            while (!itemNumber.equals("q")) {
                for (Item item : menu) {
                    if (item.getIndex() == Integer.parseInt(itemNumber)) {
                        order.addItem(item);
                        System.out.println(item.getName() + " has been added!");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Invalid option. Please try again.");
                }
                // Get the item object from the menu, and add the item to the order
                // Ask them to enter a new item index or q again, and take their input
                System.out.println("Please enter a menu item index or q to quit:");
                itemNumber = System.console().readLine();
                found = false;
            }
            orders.add(order);
            System.out.println("Thank you. Here are your order details:");
            order.display();
        }
        System.out.println("Thank you for visiting the Coffee Kiosk! Come again soon!");
        // After you have collected their order, print the order details
        // as the example below. You may use the order's display method.
    }

}
