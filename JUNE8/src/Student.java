public class Student extends Person {

    private int roll;
    private String branch;

    public Student(String name, int age,int roll,String branch) {
        super(name, age);
        this.roll=roll;
        this.branch=branch;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("roll:"+roll);
        System.out.println("Branch"+branch);
    }


}
