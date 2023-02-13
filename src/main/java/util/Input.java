package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        String input = this.scanner.nextLine();
        return input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y");
    }

    public int getInt(int min, int max) {
        int input = this.scanner.nextInt();
        if (input >= min && input <= max) {
            return input;
        } else {
            System.out.println("Invalid input. Please enter a number between " + min + " and " + max + ".");
            return getInt(min, max);
        }
    }

    public int getInt() {
        return this.scanner.nextInt();
    }


    public double getDouble(double min, double max){
        double input = this.scanner.nextDouble();
        if (input >= min && input <= max) {
            return input;
        } else {
            System.out.println("Invalid input. Please enter a number between " + min + " and " + max + ".");
            return getDouble(min, max);
        }
    }


    public double getDouble() {
        return this.scanner.nextDouble();
    }


    public static void main(String[] args) {
        Input myInput = new Input();
        String prompt = "enter an imput";

        System.out.println(myInput.getString());
        System.out.println(myInput.yesNo());
        System.out.println(myInput.getInt(10,20));
        System.out.println(myInput.getInt());
        System.out.println(myInput.getDouble(10.5,20.6));
        System.out.println(myInput.getDouble());

    }
}
