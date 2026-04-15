package OOP.phel_java;

// Class representing an item in the shopping cart
class Item {
    // Private field for price
    private double price;

    // Constructor
    public Item(double price) {
        this.price = price;
    }

    // Method to get final price with discount if applicable
    public double getFinalPrice() {
        if (price > 100) {
            return price * 0.90; // 10% discount
        }
        return price;
    }

    // Method to check if discount applied
    public boolean hasDiscount() {
        return price > 100;
    }

    // Getter for original price
    public double getOriginalPrice() {
        return price;
    }
}

// Class for shopping cart
class ShoppingCart {
    // Private list of items
    private Item[] items;

    // Constructor
    public ShoppingCart(double[] prices) {
        items = new Item[prices.length];
        for (int i = 0; i < prices.length; i++) {
            items[i] = new Item(prices[i]);
        }
    }

    // Method to display items
    public void displayItems() {
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            if (item.hasDiscount()) {
                System.out.println("Item" + (i+1) + ": GHS" + item.getFinalPrice() + "(10% Discount Applied)");
            } else {
                System.out.println("Item " + (i + 1) + ": GHS" + item.getFinalPrice());
            }
        }
    }

    // Method to get total price due
    public double getTotalPriceDue() {
        double total = 0;
        for (Item item : items) {
            total += item.getFinalPrice();
        }
        return total;
    }
}

// Main functionality moved to Main.java