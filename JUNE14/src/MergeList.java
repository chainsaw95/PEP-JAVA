import java.util.*;

public class MergeList {

    public static void main(String[] args) {


        List<Integer> l1 = new ArrayList();
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(56);

        System.out.print(l1);


        List<Integer> l2 = new ArrayList();
        l2.add(5);
        l2.add(6);
        l2.add(2);

        System.out.print(l2);

        /*l1.addAll(l2);


        System.out.println("After removing duplicates");
        HashSet<Integer> h1 = new HashSet<>(15);

        for (Integer op : l1) {
            h1.add(op);

        }*/

        List list3=new ArrayList<Integer>();
        list3.addAll(l1);

        for(Object op:l2){

            if(list3.contains(op)){

            }
            else{
                list3.add(op);
            }

        }

        System.out.println(list3);

    }


}