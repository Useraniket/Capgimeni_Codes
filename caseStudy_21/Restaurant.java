package caseStudy_21;

import java.util.*;

public class Restaurant {
    private String name;
    private List<MenuItem> menu;

    public Restaurant(String name, List<MenuItem> menu) {
        this.name = name;
        this.menu = menu;
    }

    public String getName() {
        return name;
    }

    public List<MenuItem> getMenu() {
        return menu;
    }

    public boolean isItemAvailable(String itemName) {
        return menu.stream().anyMatch(item -> item.getName().equalsIgnoreCase(itemName));
    }

    public MenuItem getMenuItem(String itemName) {
        for (MenuItem item : menu) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        return null;
    }
}
