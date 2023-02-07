import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;

        System.out.printf("The value of pi is approximately %4.2f%n", pi);


        Scanner input = new Scanner(System.in);

        System.out.println("Please ender an integer: ");
        int userInput = input.nextInt();
        System.out.println("your integer is " + userInput);

        System.out.println();

        System.out.println("Please enter a word: ");
        String firstWord = input.next();
        System.out.println("Please enter another word: ");
        String secondWord = input.next();
        System.out.println("Please enter a final word word: ");
        String thirdWord = input.next();

        System.out.println("The three words you chose are: " + firstWord +" "+ secondWord +" "+ thirdWord + "\n");

        System.out.println("Now enter a full sentence: ");
        input.nextLine();
        String userSentence = input.nextLine();

        System.out.println("The sentence you chose is: " + userSentence  + "\n");

        System.out.println("Okay, let's do some math. What is the length of your room in feet?");
        int length = Integer.parseInt(input.nextLine());

        System.out.println("What is the width of your room in feet?");
        int width = Integer.parseInt(input.nextLine());

        int area = length * width;
        int perimeter = length + length + width + width;

        System.out.println("If my math is correct, the area of your room is " + area + "ft and the perimeter of your room is " + perimeter + "ft \n");
        input.close();

        Scanner input2 = new Scanner(System.in);
//        input2.useDelimiter("\n");
        System.out.println("lets try something a little more complicated. What is the length of your room in feet?");
        double length2 = input2.nextDouble();

        System.out.println("What is the width of your room in feet?");
        double width2 = input2.nextDouble();

        System.out.println("What is the height of your room in feet?");
        double height2 = input2.nextDouble();

        double area2 = length2 * width2;
        double perimeter2 = length2 + length2 + width2 + width2;
        double volume2 = length2 * height2 * width2;

        System.out.println("The area of your room is " + area2 + "ft. the perimeter of your room is " + perimeter2 + "ft and the area if your room is " + volume2 + "sqr ft");



        input2.close();








    }
}
