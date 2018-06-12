public class StudentTest {


    public static void main(String[] args){

        Person[] ar=new Person[4];

        Person p1=new Person("Vivek Singh",22);
        Person p2=new Person("Gaurav Singh",25);


        Student s1=new Student("KAl",56,45,"MCA");
        Student s2=new Student("Tri",26,5,"BCA");


        ar[0]=p1;
        ar[1]=p2;
        ar[2]=s1;
        ar[3]=s2;

        showAll(ar);


    }

    public static void showAll(Person[] ar){

        for(int i=0;i<ar.length;i++)
            ar[i].show();


    }


}
