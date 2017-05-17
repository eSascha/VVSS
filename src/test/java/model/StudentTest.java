package model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kitai on 04-Apr-17.
 */
public class StudentTest {
    @Test
    public void getRegNumber() throws Exception {
        Student stud = new Student("test9999", "unit test", 731);
        assertEquals(stud.getRegNumber(), "test9999");
    }

    @Test
    public void setRegNumber() throws Exception {
        Student stud = new Student("test9999", "unit test", 731);
        stud.setRegNumber("test1234");
        assertEquals(stud.getRegNumber(), "test1234");
    }

    @Test
    public void getName() throws Exception {
        Student stud = new Student("test9999", "unit test", 731);
        assertEquals(stud.getName(), "unit test");
    }

    @Test
    public void setName() throws Exception {
        Student stud = new Student("test9999", "unit test", 731);
        stud.setName("unit test test");
        assertEquals(stud.getName(), "unit test test");
    }

    @Test
    public void getGroup() throws Exception {
        Student stud = new Student("test9999", "unit test", 731);
        assertEquals(stud.getGroup(), 731);
    }

    @Test
    public void setGroup() throws Exception {
        Student stud = new Student("test9999", "unit test", 731);
        stud.setGroup(721);
        assertEquals(stud.getGroup(), 721);
    }

}