import java.util.ArrayList;
import java.text.NumberFormat;

// Here we're creating a new data type called Order
public class Order {

    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items; // defaults to null

    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order() {
        name = "Guest";
        items = new ArrayList<Item>();
    }

    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public Order(String name) {
        this.name = name;
        items = new ArrayList<Item>();
    }

    // ORDER METHODS

    // Most of your code will go here,
    // so implement the getters and setters first!

    // GETTERS & SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getStatus() {
        return ready;
    }

    public void setStatus(boolean status) {
        this.ready = status;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    // OTHER ORDER METHODS
    // Adds an item to the order list
    public void addItem(Item item) {
        items.add(item);
    }

    // Gets status of the order
    public String getStatusMessage() {
        if (ready) {
            return "Your order is ready.";
        }

        return "Thank you for waiting. Your order will be ready soon.";
    }

    // Gets total owed on order placed
    public double getOrderTotal() {
        double total = 0.0;

        for (Item item : items) {
            total += item.getPrice();
        }

        return total;
    }

    // Displays all order information including prices and total owed.
    public void display() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        System.out.println("Customer name: " + name);
        System.out.println("Current Order:");
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);

            System.out.printf("%d. %s - %s%n", i + 1, item.getName(),
                    formatter.format(item.getPrice()));
        }
        System.out.println("Total: " + formatter.format(getOrderTotal()));
        System.out.println(getStatusMessage());
        System.out.print("\n\n");
    }
}
