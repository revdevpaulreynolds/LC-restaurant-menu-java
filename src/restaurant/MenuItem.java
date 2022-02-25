package restaurant;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(String name, double price, String description, String category, boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public MenuItem(String name, double price, String description, String category) {
        this(name, price, description, category, true);
    }

    public String toString() {
        return "\nName: " + name + "\nPrice: " + price + "\nDescription: " + description
                + "\nCategory: " + category + "\nNew: " + isNew + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double aPrice) {
        price = aPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String aDescription) {
        description = aDescription;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String aCategory) {
        category = aCategory;
    }

    public boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(boolean aIsNew) {
        isNew = aIsNew;
    }
}
