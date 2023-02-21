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

//    private String name;
//    private String category;
//
//    public Grocery(String name, String category) {
//        this.name = name;
//        this.category = category;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getCategory() {
//        return category;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }
//
//    @Override
//    public String toString() {
//        return "Grocery{" +
//                "name='" + name + '\'' +
//                ", category='" + category + '\'' +
//                '}';
//    }