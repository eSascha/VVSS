package validator;

import model.Laboratory;
import model.Student;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kitai on 04-Apr-17.
 */
public class ValidatorTest {
    @Test
    public void validateStudent() throws Exception {
        Validator validator = new Validator();
        Student stud = new Student("test9999", "unit test", 731);
        assertEquals(validator.validateStudent(stud), true);
    }

    @Test
    public void validateLaboratory() throws Exception {
        Validator validator = new Validator();
        float nota = 5;
        Laboratory lab = new Laboratory(1, "09/06/2017", 1, nota, "test9999");
        assertEquals(validator.validateLaboratory(lab), true);
    }

    @Test
    public void validateGrade() throws Exception {
        float nota = 7;
        Validator validator = new Validator();
        assertEquals(validator.validateGrade(nota), true);

    }

}