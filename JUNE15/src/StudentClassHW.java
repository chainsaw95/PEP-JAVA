import java.util.*;

class Student{

    private String name;
    private int rollno;
    private String section;
    private int regid;
    private static List<Student> recenlist=new ArrayList<>();
    private final int max=10;

    public Student(String name, int rollno, String section, int regid) {
        this.name = name;
        this.rollno = rollno;
        this.section = section;
        this.regid = regid;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getRegid() {
        return regid;
    }

    public void setRegid(int regid) {
        this.regid = regid;
    }

    public static void addToRecent(Student stu){

        recenlist.add(stu);

    }


}



public class StudentClassHW {

    public static void main(String[] args){












    }


}
