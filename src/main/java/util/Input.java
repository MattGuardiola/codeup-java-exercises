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


    public int getInt() {
        return this.scanner.nextInt();
    }

    public int getInt(int min, int max) {
        int input;
        try {
            input = Integer.parseInt(getString());
            if (input >= min && input <= max) {
                return input;
            }
            System.out.printf("Not between %d and %d.%n", min, max);
            return getInt(min, max);
        } catch (Exception e ) {
            System.out.println("Did not enter a valid number value.");
            return getInt(min, max);
        }
    }

    public double getDouble() {
        double input;
        try {
            input = Double.parseDouble(getString());
            return input;
        } catch (NumberFormatException e) {
            System.out.println("Did not enter a valid number value.");
            return getDouble();
        }
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        double input;
        try {
            input = Double.parseDouble(getString());
            return input;
        } catch (NumberFormatException e) {
            System.out.println("Did not enter a valid number value.");
            return getDouble();
        }
    }

    public double getDouble(double min, double max) {
        double input;
        try {
            input = Double.parseDouble(getString());
            if (input >= min && input <= max) {
                return input;
            }
            System.out.printf("Not between %f and %f.%n", min, max);
            return getDouble(min, max);
        } catch (Exception e ) {
            System.out.println("Did not enter a valid number value.");
            return getDouble(min, max);
        }
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
