/*Write a program in java that uses a for loop to display
the price of items in the shopping cart
1. Store the five items in a double array
2. Use a for loop to loop through each item in the array
3. Display each item's number and price
4. If an item is greater than 100, apply a 10% discount to that item and
    display
*/
public class ShoppingCart {
    static void main(String[] args){
        double[] ItemPrice = {45.0, 120.5, 234.0, 111.2, 23.3};
        double totalPriceDue = 0.0;

        for (int i = 0; i < ItemPrice.length; i++) {
            double currentPrice = ItemPrice[i];

            if (currentPrice > 100) {
                currentPrice *= 0.90;
                System.out.println("Item" + (i+1) +
                        ": GHS" + currentPrice +
                        "(10% Discount Applied)");
            } else {
                System.out.println("Item " + (i + 1) +
                    ": GHS" + currentPrice);
            }
        }

    }
}
