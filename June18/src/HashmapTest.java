import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class HashmapTest {

    public static void main(String[] args){

        HashMap<String,ArrayList<String>> hashFriends=new HashMap<>();

        for(int i=0;i<2;i++) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name:");
            String name = sc.nextLine();

            ArrayList<String> viveksfriend = new ArrayList<>();
            for (int j = 0; j < 2; j++) {
                viveksfriend.add(sc.nextLine());
            }

            hashFriends.put(name, viveksfriend);

        }

       System.out.println(hashFriends);

    }
}
