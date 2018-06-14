import javax.print.attribute.standard.JobKOctets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class ListDemo {

    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(2);
        l1.add(123);


        for (Object op : l1) {
            System.out.println(op);
        }


        System.out.println("After reoving duplicates");


        for (int j = 0; j < l1.size(); j++) {

            for (int i = 0; i < l1.size(); i++) {
                if (l1.indexOf(j)!=l1.lastIndexOf(j))
                    l1.remove(l1.get(i));
            }
        }




      //  HashSet<Integer> h1=new HashSet<>(15);


    /*    for(Integer op:l1){
            h1.add(op);
        }
        */

        System.out.println(l1);

    }

}
