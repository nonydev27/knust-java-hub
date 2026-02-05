package ShoppingCart;

public class Pain {

    /*Write a program in java that uses a for loop to display the oruce of items in a shopping cart.
    1. store the prices of the five items in a double array
    2. use a for loop to loop through each item in the array
    3. display each iterm's number and price
    4. if an items price is greater than 100, apply a 10% discount to that item and display a message indicating that the discount
    was applied
    5. calculate ..? and display the totral amount due after all discounts have been applied */

    //static assignment, dynamics --- array, dynamic array uses memory

    
    public static void main(String[] args) {
        System.out.println();

        double[] ItemPrices = {45.0, 120.5, 234.0, 111.2,23.3};
        double totalPriceDue = 0.0;

        for (int i = 0; i<ItemPrices.length; i++){
            double currentPrice = ItemPrices[i];

            if (currentPrice > 100){
                currentPrice *= 0.90;

                System.out.println("Item "+(i+1) +": GHS"+ currentPrice +" (10% Discount Applied)");
            } else{
                System.out.println("");
            }
        }
    }
}
