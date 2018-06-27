import java.util.*;

class Items{

    String item;
    int cost;

    public Items(String item, int cost) {
        this.item = item;
        this.cost = cost;
    }

    public String getItem() {
        return item;
    }

    public int getCost() {
        return cost;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getTotalCost(int no){

        return no*cost;
    }


}


public class BillpaymentTest {

    public static void main(String[] args){


        Scanner sc=new Scanner(System.in);

        HashMap<Integer,Items> hashmap=new HashMap<>();

        hashmap.put(1,new Items("Samosa",10));
        hashmap.put(2,new Items("Patty",20));
        hashmap.put(3,new Items("Sandwich",40));
        hashmap.put(4,new Items("Grilled Sandwich",50));


        System.out.println("\n\n\n");
        System.out.printf("%-20s %-20s %-20s\n","Item No","Item Name","Cost");

        for(int key:hashmap.keySet()){

            String n=hashmap.get(key).item;
            int c=hashmap.get(key).cost;
            System.out.printf("%-20s %-20s %-20s\n",key,n,c);

        }


        sc.useDelimiter("done");

        System.out.println("Enter your order details");
        String order=sc.next();

        String[] orderval=order.split("[\n]");


        System.out.println("Your orders are");


        System.out.printf("%-20s %-20s %-20s %-20s\n","Item No","Name","Quantity","Amount");

        int totalCostA=0;

        for(int i=0;i<orderval.length;i++){

            String[] ar=orderval[i].split("[ ]");

            int no=Integer.parseInt(ar[0]);
            int quan=Integer.parseInt(ar[1]);

            System.out.printf("%-20s %-20s %-20s %-20s\n",no,hashmap.get(no).getItem(),quan,hashmap.get(no).getTotalCost(quan));
            totalCostA=totalCostA+hashmap.get(no).getTotalCost(quan);


        }


        System.out.println("Total bill "+totalCostA);



    }

}
