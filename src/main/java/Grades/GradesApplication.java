package Grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student joey = new Student("Joey");
        joey.addGrade(95);
        joey.addGrade(100);
        joey.addGrade(92);
        students.put("joey123", joey);

        Student lorena = new Student("Lorena");
        lorena.addGrade(85);
        lorena.addGrade(88);
        lorena.addGrade(96);
        students.put("lorena123", lorena);

        Student matt = new Student("Matt");
        matt.addGrade(84);
        matt.addGrade(89);
        matt.addGrade(98);
        students.put("matt123", matt);

        Student lauren = new Student("Lauren");
        lauren.addGrade(100);
        lauren.addGrade(80);
        lauren.addGrade(88);
        students.put("lauren123", lauren);

        System.out.println("welcome!");
        welcome(students);



    }



    public static void welcome(HashMap<String, Student> students){
        System.out.println();
        System.out.println("Here are the Github usernames of our students:");
            for (String key : students.keySet()) {
                System.out.println(key);
            }
            selectStudent(students);
    }


    public static void selectStudent(HashMap<String, Student> students) {
        Scanner input = new Scanner(System.in);
        System.out.print("Which student would you like information on:");
        String studentChoice = input.nextLine();
        if (students.containsKey(studentChoice)) {
            System.out.println(students.get(studentChoice.toString()));
            selectAgain(students);
        } else {
            System.out.println("That student does not exist. Please enter a valid username");
            selectStudent(students);
        }
    }


    public static void selectAgain(HashMap<String, Student> students) {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like information on another student? (y/n)");
        String anotherStudent = input.nextLine();
        if (anotherStudent.equals("y")) {
            welcome(students);
        } else if (anotherStudent.equals("n")) {
            System.out.println("Goodbye...");
        } else {
            System.out.println(anotherStudent + "is not a valid entry.");
            selectAgain(students);
        }
    }



}