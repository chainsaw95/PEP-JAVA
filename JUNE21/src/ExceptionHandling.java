import java.util.Scanner;

public class ExceptionHandling {

    public static void  main(String[] args){


        int i=4,j=0;

        try{


            Scanner sc = new Scanner(System.in);
            System.out.println("Enter i and j");
            i = sc.nextInt();
            j = sc.nextInt();

           int temp=i/j;

            try {

                System.out.println("inner try block");
                Exception n=new Exception();

            }
            catch(ArithmeticException e){

                System.out.println("Inside inner catch block");

            }


        }
        catch (ArithmeticException e){

            System.out.println(e);

            if(j>0)
                j=Integer.MAX_VALUE;
            else
                j=Integer.MIN_VALUE;

            System.out.println("New value of j"+j);

        }



    }

}
