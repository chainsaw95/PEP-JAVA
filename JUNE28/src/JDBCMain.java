
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
public class JDBCMain {
    public static void main(String[] args) {
        try{
        Studentdao stdao=new StudentDaoImpl();
        List<Student> allStudents=stdao.getAllStudents();
        for(Student s:allStudents)
                System.out.println(s);
        }
        catch(Exception e)
        {
        }
    }
    
}
