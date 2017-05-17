package repository;

import model.Laboratory;
import model.Student;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by kitai on 04-Apr-17.
 */
public class FileDataPersistenceTest {
    @Test
    public void saveStudent() throws Exception {
        FileDataPersistence file = new FileDataPersistence("test_stud.txt");
        PrintWriter writer = new PrintWriter("test_stud.txt");
        writer.print("");
        writer.close();
        Student stud = new Student("test9999", "unit test", 731);
        file.saveStudent(stud);
        List<Student> list = new ArrayList<Student>();
        list.add(stud);
        assertEquals(file.getStudentsList(), list);
    }

    @Test
    public void saveLaboratory() throws Exception {
        FileDataPersistence file = new FileDataPersistence("test_lab.txt");
        PrintWriter writer = new PrintWriter("test_lab.txt");
        writer.print("");
        writer.close();
        float nota = 10;
        Laboratory lab = new Laboratory(1, "05/04/2017", 1, nota, "test9999");
        file.saveLaboratory(lab);
        String everything;
        BufferedReader br = new BufferedReader(new FileReader("test_lab.txt"));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            everything = sb.toString();
        } finally {
            br.close();
        }
        String result = "1 5/4/2017 1 10.0 test9999\n";
        assertEquals(everything, result);
    }

    @Test
    public void addGrade() throws Exception {
        FileDataPersistence file = new FileDataPersistence("test_lab.txt");
        PrintWriter writer = new PrintWriter("test_lab.txt");
        writer.print("");
        writer.close();
        float nota = 10;
        Laboratory lab = new Laboratory(1, "05/04/2017", 1, nota, "test9999");
        file.saveLaboratory(lab);
        nota = 7;
        file.addGrade("test9999", "1", nota);
        String everything;
        BufferedReader br = new BufferedReader(new FileReader("test_lab.txt"));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            everything = sb.toString();
        } finally {
            br.close();
        }
        String result = "1 5/4/2017 1 7.0 test9999\n";
        assertEquals(everything, result);
    }


    @Test
    public void getStudentsList() throws Exception {
        FileDataPersistence file = new FileDataPersistence("test_stud.txt");
        PrintWriter writer = new PrintWriter("test_stud.txt");
        writer.print("");
        writer.close();
        Student stud = new Student("test9999", "unit test", 731);
        file.saveStudent(stud);
        List<Student> list = new ArrayList<Student>();
        list.add(stud);
        assertEquals(file.getStudentsList(), list);
    }

}