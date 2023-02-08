import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);




        String userChoice = "yes";

        while (userChoice.equals("yes")) {
            System.out.println("Say Something to Bob:");
            String something = input.nextLine();

            if (something.endsWith("?")) {
                System.out.println("Bob says: Sure");
            } else if (something.endsWith("!")) {
                System.out.println("Bob says: Whoa, chill out!");
            } else if (something.equals("")) {
                System.out.println("Bob says: Fine. Be that way!");
            } else {
                System.out.println("Bob says: Whatever");
            }
            System.out.print("Would you like to say something else to Bob (yes/no): ");
            userChoice = input.next();
        }






        input.close();

    }
}
