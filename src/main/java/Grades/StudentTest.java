package Grades;

public class StudentTest {
    public static void main(String[] args) {
        Student greg = new Student("Greg");

        greg.addGrade(90);
        greg.addGrade(92);
        greg.addGrade(84);
        greg.addGrade(75);
        greg.addGrade(100);

        System.out.println(greg.getGradeAverage());

    }
}
