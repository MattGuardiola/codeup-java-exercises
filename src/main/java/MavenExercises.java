import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an input: ");
        String sentence = input.nextLine();

        boolean isNumeric = StringUtils.isNumeric(sentence);
        String flipedCase = StringUtils.swapCase(sentence);
        String reversed = StringUtils.reverse(sentence);
        if (isNumeric) {
            System.out.println(sentence + " is a number");
        }
        if (!isNumeric) {
            System.out.println(sentence + " is not a number");
        }

        System.out.println("Flipped Case: " + flipedCase);
        System.out.println("Reversed: " + reversed);

    }
}
