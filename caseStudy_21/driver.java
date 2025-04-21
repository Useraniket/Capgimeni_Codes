package caseStudy_21;

import java.util.*;

public class driver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<MenuItem> m = new ArrayList<>();
        m.add(new MenuItem("Burger", 120));
        m.add(new MenuItem("Pizza", 250));
        m.add(new MenuItem("Pasta", 180));
        m.add(new MenuItem("Fries", 90));
        m.add(new MenuItem("Sandwich", 110));
        Restaurant r = new Restaurant("Calcutta Bistro", m);

        System.out.println("Welcome to " + r.getName());
        System.out.println("Menu:");
        for(int i=0;i<r.getMenu().size();i++){
            MenuItem it = r.getMenu().get(i);
            System.out.println(it.getName() + " - ₹" + it.getPrice());
        }

        Customer c = new Customer("aniket", "1234");

        System.out.println("login pls");
        System.out.print("username: ");
        String u = s.nextLine();

        System.out.print("pass: ");
        String p = s.nextLine();

        if(!u.equalsIgnoreCase(c.getName()) || !c.login(p)){
            System.out.println("invalid. bye");
            return;
        }

        System.out.println("how many items?");
        int n = s.nextInt();
        s.nextLine();
        ArrayList<String> ol = new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.print("item " + (i+1) + ": ");
            String x = s.nextLine();
            ol.add(x);
        }

        try {
            Order.placeOrder(c, r, ol);
        } catch(Exception e){
            System.out.println("oops: " + e.getMessage());
        }
    }
}
