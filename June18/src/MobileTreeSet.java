import java.util.*;


public class MobileTreeSet {

public static void main(String[] args){


    Mobile m1=new Mobile(124,5.6,680.0);
    Mobile m2=new Mobile(1240,5.605,65580.0);
    Mobile m3=new Mobile(1024,6.4,68650.0);


    Set<Mobile> s1=new TreeSet<Mobile>();
    s1.add(m1);
    s1.add(m2);
    s1.add(m3);


    Iterator<Mobile> itr=s1.iterator();

    while(itr.hasNext()){
        System.out.println(itr.next());
    }





}









}
