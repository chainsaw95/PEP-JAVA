import java.util.Scanner;

public class ArmStrong {

    public static void main(String[] args){


        Scanner sc=new Scanner(System.in);


        int n=sc.nextInt();

        int remainder;
        int result=0;
        int original=n;
        int length=String.valueOf(n).length();

        while(n!=0){

            remainder=n%10;
            result = (int) (result + Math.pow(remainder, length));
            n=n/10;
        }


        if(result==original)
            System.out.print("Armstrong number");
        else
            System.out.print("not an Armstrong number");


    }



}
