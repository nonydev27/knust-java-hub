// Declare the package for this Java file to organize the code
package OOP.phel_java;

// Blank line

// Define a class named ShoppingCart to manage a collection of items
class ShoppingCart {
    // Declare a private array of Item objects to store the items in the cart
    private Item[] items;

    // Blank line

    // Define a public constructor for the ShoppingCart class that takes an array of double prices
    public ShoppingCart(double[] prices) {
        // Initialize the items array with the same length as the prices array
        items = new Item[prices.length];
        // Loop through each price in the prices array
        for (int i = 0; i < prices.length; i++) {
            // Create a new Item object for each price and assign it to the items array
            items[i] = new Item(prices[i]);
        }
    }

    // Blank line

    // Define a public method named displayItems that prints the items and their prices to the console
    public void displayItems() {
        // Loop through each item in the items array using an index
        for (int i = 0; i < items.length; i++) {
            // Get the current Item object from the array
            Item item = items[i];
            // Check if the item has a discount applied
            if (item.hasDiscount()) {
                // Print the item number, final price with currency, and discount message
                System.out.println("Item" + (i+1) + ": GHS" + item.getFinalPrice() + "(10% Discount Applied)");
            } else {
                // Print the item number and final price with currency
                System.out.println("Item " + (i + 1) + ": GHS" + item.getFinalPrice());
            }
        }
    }

    // Blank line

    // Define a public method named getTotalPriceDue that returns the total price of all items as a double
    public double getTotalPriceDue() {
        // Initialize a total variable to accumulate the sum
        double total = 0;
        // Loop through each Item in the items array using enhanced for loop
        for (Item item : items) {
            // Add the final price of each item to the total
            total += item.getFinalPrice();
        }
        // Return the calculated total
        return total;
    }
}

// Blank line

// Comment indicating that the main functionality has been moved to Main.java