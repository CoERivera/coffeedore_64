class CafeTest {
    public static void main(String[] args) {
        // Creating the items to be used for the orders
        CoffeeKiosk kiosk = new CoffeeKiosk();

        Item espresso = new Item("espresso", 2.5);
        kiosk.addMenuItem(espresso);
        Item drip = new Item("drip coffee", 3.0);
        kiosk.addMenuItem(drip);
        Item cappuccino = new Item("cappuccino", 3.5);
        kiosk.addMenuItem(cappuccino);
        Item latte = new Item("latte", 4.0);
        kiosk.addMenuItem(latte);
        Item mocha = new Item("mocha", 4.5);
        kiosk.addMenuItem(mocha);

        kiosk.newOrder();
    }
}