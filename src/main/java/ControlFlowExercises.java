import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }
//
//
//        int x = 2;
//        do {
//            System.out.println(x);
//            x += 2;
//        } while (x <= 100);
//
//
//        int y = 100;
//        do {
//            System.out.println(y);
//            y -= 5;
//        } while (y >= -10);

//        long z = 2;
//
//        do{
//            System.out.println(z);
//            z = z * z;
//        } while (z < 1000000);


//
//
//        for(int i = 5; i <= 15; i += 1) {
//            System.out.println(i);
//        }

//
//        for(long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }


//        int f = 1;
//        do{
//            if (f % 3 == 0 && f % 5 == 0)  {
//                System.out.println("FizzBuzz");
//            } else if (f % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (f % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(f);
//            }
//            f += 1;
//        } while (f <= 100);


        Scanner input = new Scanner(System.in);


//        String userInput;
//        do {
//            System.out.print("Enter an integer: ");
//            int n = input.nextInt();
//
//            System.out.println("Number\tSquare\tCube");
//            System.out.println("-------------------------");
//            for (int i = 1; i <= n; i++) {
//                System.out.printf("%-7d | %-7d | %-7d%n", i, (i * i), (i * i * i));
//            }
//
//            System.out.print("Do you want to continue (yes/no)? ");
//            userInput = input.next();
//        } while (userInput.equals("yes"));



        String userChoice = "yes";

        while (userChoice.equals("yes")) {
            System.out.print("Enter a numerical grade: ");
            int grade = input.nextInt();
            char letterGrade;

            if (grade >= 88) {
                letterGrade = 'A';
            } else if (grade >= 80) {
                letterGrade = 'B';
            } else if (grade >= 67) {
                letterGrade = 'C';
            } else if (grade >= 60) {
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }

            System.out.println("Letter grade: " + letterGrade);

            System.out.print("Continue? (yes/no): ");
            userChoice = input.next();
        }

        input.close();

    }
}
