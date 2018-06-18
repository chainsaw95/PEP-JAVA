import java.util.ArrayDeque;

public class TestDeque {


    public static void main(String[] args){


        ArrayDeque<Integer> dq=new ArrayDeque<>();
        dq.add(23);
        dq.add(45);
        dq.addFirst(77);
        dq.addFirst(4);
        dq.addLast(74);
        dq.addLast(999);

        System.out.print(dq);


        dq.removeFirst();
        dq.removeLast();

        System.out.print(dq);


    }

}
