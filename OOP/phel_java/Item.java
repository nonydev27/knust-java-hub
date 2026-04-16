// Declare the package for this Java file to organize the code
package OOP.phel_java;

// Blank line

// Define a class named Item to represent an individual item in the shopping cart
class Item {
    // Declare a private field of type double to store the original price of the item
    private double price;

    // Blank line

    // Define a public constructor for the Item class that takes a double parameter for the price
    public Item(double price) {
        // Assign the passed price parameter to the private price field
        this.price = price;
    }

    // Blank line

    // Define a public method named getFinalPrice that returns a double, calculating the price after discount if applicable
    public double getFinalPrice() {
        // Check if the price is greater than 100 to apply a discount
        if (price > 100) {
            // Return the price multiplied by 0.90 to apply a 10% discount
            return price * 0.90; // 10% discount
        }
        // If no discount, return the original price
        return price;
    }

    // Blank line

    // Define a public method named hasDiscount that returns a boolean indicating if a discount is applied
    public boolean hasDiscount() {
        // Return true if the price is greater than 100, otherwise false
        return price > 100;
    }

    // Blank line

    // Define a public getter method named getOriginalPrice that returns the original price as a double
    public double getOriginalPrice() {
        // Return the value of the private price field
        return price;
    }
}