package restaurant;

import java.util.ArrayList;

public class Restaurant {
    public static void main(String[] args) {

        MenuItem broccoli = new MenuItem("broccoli", 4.99, "C'mon, it's broccoli", "appetizer");
        MenuItem burger = new MenuItem("burger", 7.99, "Nice juicy burger", "main course");
        MenuItem iceCream = new MenuItem("ice cream", 3.99, "homemade ice cream", "dessert");

        Menu redRobin = new Menu();
        ArrayList<MenuItem> initialize = new ArrayList<>();
        initialize.add(broccoli);
        initialize.add(burger);

        redRobin.setSelections(initialize);
        redRobin.addSelection(iceCream);

        redRobin.deleteSelection(burger);
    }
}
