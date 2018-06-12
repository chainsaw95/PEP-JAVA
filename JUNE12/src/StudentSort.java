interface Comparator{

    public int compare(Student s1,Student s2);
}

class StudentRollComparator implements Comparator{


    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getRollno()>s2.getRollno()) return 1;

        if(s1.getRollno()< s2.getRollno()) return -1;

        return 0;
    }
}


class StudentMArksComparator implements Comparator{


    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getMarks()>s2.getMarks()) return 1;
        if(s1.getMarks()<s2.getMarks()) return -1;
        return 0;
    }
}



public class StudentSort  {



    public void sortAr(Student[] ar,Comparator comp) {

        int i = 0;
        int j = 0;


        for (i = ar.length - 1; i > 0; i--) {

            for (j = 0; j < i; j++) {

                if (comp.compare(ar[j],ar[j+1])>0) {
                    Student temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }

            }
        }


    }


}