public class Student {

    int rollno;
    String name;
    String branch;
    Pen p1;
    public Student(int rollno, String name,Pen p1) {
        this.rollno = rollno;
        this.name = name;
        this.p1=p1;
    }

    public Student(int rollno, String name, String branch) {
        this.rollno = rollno;
        this.name = name;
        this.branch = branch;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void owns(Pen p1){

        this.p1=p1;
        p1.s1=this;

    }

    public void getPen(){

        System.out.println("Student "+name+"  uses "+p1.type+"pen of brand  "+p1.brand);


    }
}
