import java.util.*;

public class TestDoublyLinkedList {

    public static void main(String[] agrs){


        List<Integer> l1=new ArrayList<>();

        l1.add(15); l1.add(55); l1.add(66);

        Iterator<Integer> itr=l1.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }


        List<String> ll=new LinkedList<>();

        ll.add("one");
        ll.add("two");
        ll.add("three");

        Iterator<String> it1=((LinkedList<String>) ll).descendingIterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }



    }

}
