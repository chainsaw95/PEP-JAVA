public class TestStudent {
    public static void main(String[] args) {


        Student[] ar = new Student[5];

        ar[0] = new Student("Vivek Singh", 78, 18);
        ar[1] = new Student("Amit", 58, 65);
        ar[2] = new Student("Faraz", 96, 68);
        ar[3] = new Student("Gaurav", 65, 22);
        ar[4] = new Student("Abhijeet", 1, 88);

        StudentSort asort=new StudentSort();

        StudentMArksComparator smarks=new StudentMArksComparator();

        asort.sortAr(ar,smarks);

z
        for (int i = 0; i < ar.length; i++) {

            System.out.println(ar[i].getName()+" roll "+ar[i].getRollno()+" marks:"+ar[i].getMarks());


        }


    }


    }




