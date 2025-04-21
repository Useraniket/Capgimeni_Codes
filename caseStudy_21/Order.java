package caseStudy_21;

import java.util.*;

public class Order {
    public static void placeOrder(Customer customer, Restaurant restaurant, List<String> itemNames)
            throws OrderLimitExceedException, MenuItemNotFoundException {

        if (!customer.isLoggedIn()) {
            System.out.println("Please log in to place an order.");
            return;
        }

        if (itemNames.size() > 5) {
            throw new OrderLimitExceedException("Cannot order more than 5 items.");
        }

        double total = 0;
        System.out.println("\nOrder Summary:");
        for (String itemName : itemNames) {
            if (!restaurant.isItemAvailable(itemName)) {
                throw new MenuItemNotFoundException("Menu item not found: " + itemName);
            }
            MenuItem item = restaurant.getMenuItem(itemName);
            total += item.getPrice();
            System.out.println("- " + item.getName() + " : ₹" + item.getPrice());
        }

        System.out.println("Total Amount: ₹" + total);
        System.out.println("Order placed successfully!");
    }
}
