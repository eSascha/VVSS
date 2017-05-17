package model;

import org.junit.Test;

import java.text.Format;
import java.text.SimpleDateFormat;

import static org.junit.Assert.*;

/**
 * Created by kitai on 04-Apr-17.
 */
public class LaboratoryTest {
    @Test
    public void getNumber() throws Exception {
        float nota = 5;
        Laboratory lab = new Laboratory(1, "09/04/2017", 1, nota, "test9999");
        assertEquals(lab.getNumber(), 1);
    }

    @Test
    public void setNumber() throws Exception {
        float nota = 5;
        Laboratory lab = new Laboratory(1, "09/04/2017", 1, nota, "test9999");
        lab.setNumber(2);
        assertEquals(lab.getNumber(), 2);
    }

    @Test
    public void getDate() throws Exception {
        float nota = 5;
        Laboratory lab = new Laboratory(1, "09/04/2017", 1, nota, "test9999");
        Format format = new SimpleDateFormat("dd/MM/yyyy");
        assertEquals(format.format(lab.getDate()), "09/04/2017");
    }

    @Test
    public void setDate() throws Exception {
        float nota = 5;
        Laboratory lab = new Laboratory(1, "06/04/2017", 1, nota, "test9999");
        lab.setDate("09/04/2017");
        Format format = new SimpleDateFormat("dd/MM/yyyy");
        assertEquals(format.format(lab.getDate()), "09/04/2017");
    }

    @Test
    public void getProblemNumber() throws Exception {
        float nota = 5;
        Laboratory lab = new Laboratory(1, "09/04/2017", 1, nota, "test9999");
        assertEquals(lab.getProblemNumber(), 1);
    }

    @Test
    public void setProblemNumber() throws Exception {
        float nota = 5;
        Laboratory lab = new Laboratory(1, "09/04/2017", 1, nota, "test9999");
        lab.setProblemNumber(2);
        assertEquals(lab.getProblemNumber(), 2);
    }

    @Test
    public void getGrade() throws Exception {
        float nota = 5;
        Laboratory lab = new Laboratory(1, "09/04/2017", 1, nota, "test9999");
        assertEquals(lab.getGrade(), nota, 0);
    }

    @Test
    public void setGrade() throws Exception {
        float nota = 5;
        Laboratory lab = new Laboratory(1, "09/04/2017", 1, nota, "test9999");
        nota = 7;
        lab.setGrade(nota);
        assertEquals(lab.getGrade(), nota, 0);
    }

    @Test
    public void getStudentRegNumber() throws Exception {
        float nota = 5;
        Laboratory lab = new Laboratory(1, "09/04/2017", 1, nota, "test9999");
        assertEquals(lab.getStudentRegNumber(), "test9999");
    }

    @Test
    public void setStudentRegNumber() throws Exception {
        float nota = 5;
        Laboratory lab = new Laboratory(1, "09/04/2017", 1, nota, "test9999");
        lab.setStudentRegNumber("test1234");
        assertEquals(lab.getStudentRegNumber(), "test1234");
    }

}