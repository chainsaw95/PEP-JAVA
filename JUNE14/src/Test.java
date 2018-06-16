import java.util.*;

public class Test{

    public static void main(String[] args){


        ArrayList<Integer> positive=new ArrayList<Integer>();
        ArrayList<Integer> negative=new ArrayList<Integer>();

        Scanner sc=new Scanner(System.in);


        while(sc.hasNext()){

            int n=sc.nextInt();

            if(n>=0)
                positive.add(n);

            if(n<0)
                negative.add(n);

        }


        for(int i=0;i<negative.size();i++)
        {
            if(i!=0 || i!=negative.size()-1)
                System.out.print(" ");

                System.out.print(negative.get(i));
        }


        Collections.sort(positive);

        for(int i=0;i<positive.size();i++)
        {
            if(i!=0 || i!=positive.size()-1)
                System.out.print(" ");

            System.out.print(positive.get(i));
        }


    }



}