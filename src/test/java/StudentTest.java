import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class StudentTest {

    private Student bob;
    @Before

    public void initTestData() {
         bob = new Student(123456789, "Bob");
         bob.addGrade(90);
         bob.addGrade(80);
         bob.addGrade(100);
    }

    @Test
    public void testStudentNameGetterMatchesConstructor() {
        assertEquals("Bob", bob.getName());
    }

    @Test
    public void testStudentIdGetterMatchesConstructor() {
        assertEquals(123456789, bob.getId());
    }

    @Test
    public void testAbleToAddGrade(){
        assertEquals(Arrays.asList(90, 80, 100), bob.getGrades());
    }

}
