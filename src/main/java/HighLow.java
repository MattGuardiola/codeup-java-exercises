import java.util.Objects;
import java.util.Scanner;

public class HighLow {
    public static int highLowGameNumber(){
        int min = 1;
        int max = 100;
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }


    public static void highLowGamePlay(int gameRandomNumber) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose a number between 1 and 100");
        int userGuess = input.nextInt();
        if (userGuess < gameRandomNumber) {
            System.out.println("too low! try a higher number");
            highLowGamePlay(gameRandomNumber);
        } else if (userGuess > gameRandomNumber) {
            System.out.println("too high! try a lower number");
            highLowGamePlay(gameRandomNumber);
        } else {
            System.out.println("Winner! my number was " + gameRandomNumber);
        }

    }

    public static void playAgain(){
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to play again (yes/no)");
        String playAgain = input.nextLine();
        if (Objects.equals(playAgain, "no")) {
            System.out.println("Goodbye...");
        } else {
            int newRandomNumber = highLowGameNumber();
            highLowGamePlay(newRandomNumber);
            playAgain();
        }
    }








    public static void main(String[] args) {
        int gameRandomNumber = highLowGameNumber();
        highLowGamePlay(gameRandomNumber);
        playAgain();

    }
}
