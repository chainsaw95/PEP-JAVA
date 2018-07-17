
import java.sql.*;
import java.util.ArrayList;
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
public class StudentDaoImpl implements Studentdao {

    @Override
    public List<Student> getAllStudents() {
        List<Student> list=new ArrayList<>(); 
        
        try{
        Connection conn=DBConnection.getConnection();
        PreparedStatement pst=conn.prepareStatement("select * from student");
        ResultSet rs=pst.executeQuery();
        
        while(rs.next())
        {
        int roll=rs.getInt("Roll_no");
        String name=rs.getString("Name");
        Student s=new Student(name,roll);
        list.add(s);
        }
        }
        catch(Exception e){}
    
    return list;
    }

    @Override
    public void updateStudent(Student s) {
           
    }

    @Override
    public boolean deleteStudent(Student s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addStudent(Student s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student getStudent(int roll) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
