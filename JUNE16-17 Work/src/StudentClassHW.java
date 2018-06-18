import java.util.*;

class Student{

    private String name;
    private int rollno;
    private String section;
    private int regid;
    List<Student> studList=new ArrayList();
    public static List<Student> recenlist=new ArrayList<>();
    public static int indexList=0;
    private final int max=10;


    public Student(){



    }


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

    public void addToRecent(Student stu){

        if(recenlist.size()<=10){
            recenlist.add(indexList,stu);
            indexList++;
        }
        else{

            indexList=0;
            recenlist.add(stu);
        }

    }

    public void showRecent(){

        Scanner sc=new Scanner(System.in);

        int recViewIndex=0;

        while(true){

            showDetails(recenlist.get(recViewIndex).getRegid());

            char c=sc.next().charAt(0);

            System.out.println("P-N-D-E");
         switch (c){
             case 'p':
                 recViewIndex--;
                 showDetails(recenlist.get(recViewIndex).getRegid());
                 break;
             case 'n':
                 recViewIndex++;
                 showDetails(recenlist.get(recViewIndex).getRegid());
                 break;
             case 'd':
                 recenlist.remove(recViewIndex);
                 break;
             case 'e':
                 return;

         }

        }

    }



    public void showDetails(int regid){

        for(Student o:studList){

            if(o.getRegid()==regid) {
                System.out.print(o);
                addToRecent(o);
                return;
            }

        }

        System.out.println("Student with regid"+regid+"not found");

    }

    public void addDetails(Student s1){

        studList.add(s1);

    }

    public void delDetails(int regid){

        for(Student o:studList){

            if(o.getRegid()==regid) {

                studList.remove(o);
                System.out.println("Student Removed");
                return;
            }

        }

        System.out.println("Student with regid"+regid+"not found");



    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                ", section='" + section + '\'' +
                ", regid=" + regid +
                '}';
    }
}



public class StudentClassHW {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        Student s=new Student();

        while(true){

            System.out.println("Enter your choice\n\n");

            System.out.println("1)View Student Detail");
            System.out.println("2)Add Student ");
            System.out.println("3)Delete Student ");
            System.out.println("4)View Recent Students");
            System.out.println("5)Exit");

            int choice=sc.nextInt();

            switch(choice) {

                case 1:

                    System.out.println("Enter student regid");
                    int regid=sc.nextInt();
                    s.showDetails(regid);
                    break;

                case 2:

                    sc.nextLine();
                    System.out.println("Enter the name");
                    String name=sc.nextLine();

                    System.out.println("Enter rollno");
                    int roll=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Section");
                    String section=sc.nextLine();
                    System.out.println("Enter Regid");
                    int reg=sc.nextInt();

                    Student stemp=new Student(name,roll,section,reg);
                    s.addDetails(stemp);
                    break;

                case 3:


                    System.out.println("Enter student regid");
                    int regidel=sc.nextInt();
                    s.delDetails(regidel);

                break;

                case 4:
                    s.showRecent();
                    break;

                case 5:
                    System.exit(0);
                    break;

            }

        }

    }


}
