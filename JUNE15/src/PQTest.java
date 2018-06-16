import java.util.PriorityQueue;

public class PQTest {

    public static void main(String[] args){

        /*PriorityQueue<String> pq=new PriorityQueue<>();
        pq.add("one");
        pq.add("two");
        pq.add("third");
        pq.add("fourth");
*/


   //     System.out.println(pq);

        class Customer implements Comparable<Customer>{

            String name;
            int priority;

            public Customer(String name, int priority) {
                this.name = name;
                this.priority = priority;
            }

            @Override
            public int compareTo(Customer o) {
                return this.priority-o.priority;
            }

            @Override
            public String toString() {
                return "Customer{" +
                        "name='" + name + '\'' +
                        ", priority=" + priority +
                        '}';
            }
        }


        /*while(!pq.isEmpty()){
            String s1=pq.poll();
            System.out.println(s1);
        }*/

        PriorityQueue<Customer> cus=new PriorityQueue<>();
        cus.add(new Customer("Vivek",1));
        cus.add(new Customer("Gaurav",2));
        cus.add(new Customer("Lokesh",3));




        while(!cus.isEmpty()){


            Customer temp=cus.poll();
            System.out.println(temp);

        }




    }



}
