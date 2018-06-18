import java.util.*;

public class StringCount {

    public static void main(String[] args){

        String str="this is a java string";

        HashSet<Character> count=new HashSet<Character>();


        // Linked Hash set preserves order
        // TreeSet gives sorted order
        Set<Character> countll=new LinkedHashSet<Character>();

        for(int i=0;i<str.length();i++){
            count.add(str.charAt(i));
            countll.add(str.charAt(i));

        }

        System.out.println(count.size());

        Iterator<Character> itr=count.iterator();

        while(itr.hasNext()){

            System.out.print(itr.next());

        }

        Iterator<Character> itr1=countll.iterator();

        while(itr1.hasNext()){

            System.out.print(itr1.next());

        }

    }

}
