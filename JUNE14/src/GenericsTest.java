class Pair<T1,T2>{

    T1 data1;
    T2 data2;


    public Pair(T1 data, T2 data1) {
        this.data1 = data;
        this.data2 = data1;
    }


    @Override
    public String toString() {
        return "Pair{" +
                "data=" + data1 +
                ", data=" + data2 +
                '}';
    }
}

public class GenericsTest {


    public static void main(String[] args){


        Pair p=show(5);
        System.out.print(p);

    }



   public static Pair show(int n){


        Boolean isEvenFlag=false;
        if(n%2==0)
            isEvenFlag=true;
        int sum=0;
        for(int i=1;i<=n;i++)
            sum=sum+i;

        Pair p1=new Pair<Boolean,Integer>(isEvenFlag,sum);

        return p1;

    }




}
