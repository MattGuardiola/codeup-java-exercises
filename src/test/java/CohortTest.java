import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CohortTest {

    private Cohort testCohort;
    private Student testStudentOne;
    private Student testStudentTwo;

    @Before
    public void setUp() {
        testCohort = new Cohort();
        testStudentOne = new Student(123456789, "Matt");
        testStudentTwo = new Student(987654321, "Lauren");
        testCohort.addStudent(testStudentOne);
        testCohort.addStudent(testStudentTwo);
    }

    @Test
    public void testCohortInstanceCanAddStudentAndGetStudentsList() {
        Student[] expected = {testStudentOne, testStudentTwo};
        assertEquals(expected, testCohort.getStudents().toArray(new Student[expected.length]));
    }

    @Test
    public void testCohortInstanceCanGetGradesAverage() {
        testStudentOne.addGrade(100);
        testStudentTwo.addGrade(50);
        assertEquals(75, testCohort.getCohortAverage(), 0);
    }

    @Test
    public void testFindAStudentMethodWithID() {
        assertEquals(123456789, testStudentOne.getId());
    }

}


