import java.util.Scanner;
public class BMI {

    public static void main(String[] args){

        int weight;
        double height;
        double bmi;

        Scanner sc=new Scanner(System.in);

        weight=sc.nextInt();
        height=sc.nextDouble();


        bmi=(weight/Math.pow(height,2));

        if(bmi<18.5)
            System.out.println("U");
        else if(bmi >= 18.5 && bmi<25.0)
            System.out.println("N");
        else if(bmi >= 25.0 && bmi <30.0)
            System.out.print("H");
        else if(bmi >=30.0)
            System.out.println("O");


    }

}
