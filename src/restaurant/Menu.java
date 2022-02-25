package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> selections;
    private Date lastUpdated;

    public ArrayList<MenuItem> getSelections() {
        return selections;
    }

    public void setSelections(ArrayList<MenuItem> aSelections) {
        selections = aSelections;
    }

    public void addSelection(MenuItem menuItem) {
        selections.add(menuItem);
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date aLastUpdated) {
        lastUpdated = aLastUpdated;
    }

    public String toString() {
        StringBuilder menu = new StringBuilder();
        for (MenuItem selection : selections) {
            String s = "\nName: " + selection.getName() + "\nPrice: "
                    + selection.getPrice() + "\nDescription: " + selection.getDescription()
                    + "\nCategory: " + selection.getCategory() + "\nNew: " + selection.getIsNew() + "\n";

            menu.append(s);
        }
        return menu.toString();
    }

    public void deleteSelection(MenuItem name) {
        if (!selections.contains(name)) {
            System.out.println("Selection not found");
//            return "Selection not found";
        }
//        int index = selections.indexOf(name);
        selections.remove(name);
//        return selections.toString();
    }
}
