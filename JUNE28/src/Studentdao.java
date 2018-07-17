
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhinav
 */
public interface Studentdao {
    
    List<Student> getAllStudents();
    void updateStudent(Student s);
    boolean deleteStudent(Student s);
    void addStudent(Student s);
    Student getStudent(int roll);
    
}
