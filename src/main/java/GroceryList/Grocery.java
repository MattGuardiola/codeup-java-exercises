package GroceryList;

public class Grocery implements Comparable<Grocery> {
    private int category;
    private String name;
    private int quantity;

    public Grocery(int category, String name, int quantity) {
        this.category = category;
        this.name = name;
        this.quantity = quantity;
    }

    public int getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public int compareTo(Grocery other) {
        int categoryDiff = Integer.compare(category, other.getCategory());
        if (categoryDiff != 0) {
            return category;
        } else{
            return -1;
        }
    }
}