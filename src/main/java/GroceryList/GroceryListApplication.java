package GroceryList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GroceryListApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Grocery> groceryList = new ArrayList<>();


        System.out.print("Would you like to create a grocery list? (yes/no): ");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("yes")) {
            while (true) {
                System.out.print("Would you like to enter a new item? (yes/no): ");
                answer = scanner.nextLine();

                if (answer.equalsIgnoreCase("no")) {
                    break;
                }

                System.out.println("Choose a category:");
                System.out.println("1. Produce");
                System.out.println("2. Dairy");
                System.out.println("3. Meat");
                System.out.println("4. Bakery");
                System.out.println("5. Canned Goods");
                System.out.println("6. Frozen Foods");
                int category = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter the name of the item: ");
                String name = scanner.nextLine();

                System.out.print("Enter how many of the item: ");
                int quantity = scanner.nextInt();
                scanner.nextLine();


                groceryList.add(new Grocery(category, name, quantity));



                System.out.print("Would you like to finalize the list? (yes/no): ");
                answer = scanner.nextLine();

                if (answer.equalsIgnoreCase("yes")) {
                    break;
                }
            }


            Collections.sort(groceryList);


            System.out.println("Here is your final grocery list:");

            int currentCategory = -1;

            for (Grocery item : groceryList) {
                if (item.getCategory() != currentCategory) {
                    currentCategory = item.getCategory();
                    System.out.println(getCategoryName(currentCategory) + ":");
                }

                System.out.println("- " + item.getName() + " (" + item.getQuantity() + ")");
            }
        }
    }


    private static String getCategoryName(int category) {
        switch (category) {
            case 1:
                return "Produce";
            case 2:
                return "Dairy";
            case 3:
                return "Meat";
            case 4:
                return "Bakery";
            case 5:
                return "Canned Goods";
            case 6:
                return "Frozen Foods";
            default:
                return "Unknown";
        }
    }
}