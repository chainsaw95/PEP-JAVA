import java.util.Scanner;

public class CmpString {

    public static void main(String[] args){


        Scanner sc=new Scanner(System.in);

        String str1=sc.nextLine();
        String str2=sc.nextLine();


        if(str1.compareTo(str2)>0){
            System.out.println("The First String is greater than the second");
        }
        else if(str1.compareTo(str2)<0)
        {
            System.out.println("The First String is smaller than the second");
        }
        else
            System.out.println("Both the strings are equal");


    }

}
