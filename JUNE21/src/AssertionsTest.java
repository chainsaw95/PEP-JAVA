import java.util.Scanner;

public class AssertionsTest {


    public static void main(String[] args){


        Scanner sc=new Scanner(System.in);

        System.out.println("Enter an even number");
        int no=sc.nextInt();

        assert(no<0);


    }


}
