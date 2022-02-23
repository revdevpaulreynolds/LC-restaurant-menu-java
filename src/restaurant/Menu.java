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
}
