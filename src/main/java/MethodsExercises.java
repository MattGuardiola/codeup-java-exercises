import java.util.Scanner;

public class MethodsExercises {
    public static int addANumber (int firstNum, int secondNum){
        return firstNum + secondNum;
    }

    public static int subtractANumber (int firstNum, int secondNum){
        return firstNum - secondNum;
    }

    public static int multiplyANumber (int firstNum, int secondNum){
        return firstNum * secondNum;
    }

    public static int divideANumber (int firstNum, int secondNum){
        return firstNum / secondNum;
    }

    public static int modANumber (int firstNum, int secondNum){
        return firstNum % secondNum;
    }

    public static int loopANumber (int firstNum, int secondNum){
       long result = firstNum;
        for(int i = 1; i < secondNum; i++){
            result += firstNum;
        }
        return (int) result;
    }



        public static void getUserNumber(int min, int max) {
            Scanner input = new Scanner(System.in);
            System.out.println("choose a number between " + min + " and " + max + ":");
        int userNumber = input.nextInt();
            if (userNumber > min && userNumber < max) {
                System.out.println("The user has chosen number: " + userNumber);
            } else if (userNumber > max) {
                System.out.println("Your number is too high! Try a lower number.");
                getUserNumber(min, max);
            } else {
                System.out.println("Your number is too low! Try a higher number.");
                getUserNumber(min, max);
            }
            input.close();
    }



    public static void findTheFactorial () {
        Scanner input = new Scanner(System.in);
        System.out.println("Pick a number, any number!:");
        int userChoice = input.nextInt();
        System.out.println(userChoice);
        input.close();
    }










    public static void main(String[] args) {

        int firstNum = 20;
        int secondNum = 10;

        System.out.println(addANumber(firstNum, secondNum));
        System.out.println(subtractANumber(firstNum, secondNum));
        System.out.println(multiplyANumber(firstNum, secondNum));
        System.out.println(divideANumber(firstNum, secondNum));
        System.out.println(modANumber(firstNum, secondNum));
        System.out.println(loopANumber(firstNum, secondNum));

        getUserNumber(50 , 100);
        findTheFactorial();


    }

}


