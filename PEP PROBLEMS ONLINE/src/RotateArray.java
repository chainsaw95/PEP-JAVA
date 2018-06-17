import java.util.Scanner;

public class RotateArray {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int[] dataLeft=new int[n];
        int[] dataRight=new int[n];


        for(int i=0;i<n;i++){
            dataLeft[i]=dataRight[i]=sc.nextInt();

        }

        int noRotate=sc.nextInt();

        rotateLeft(dataLeft,noRotate);

        for(int i=0;i<dataLeft.length;i++) {
            System.out.print(dataLeft[i]);
            if(i!=0 || i!=dataLeft.length-1)
                System.out.print(" ");
        }

        rotateRight(dataRight,noRotate);

        System.out.println();
        for(int i=0;i<dataRight.length;i++) {
            System.out.print(dataRight[i]);
            if (i != 0 || i != dataRight.length - 1)
                System.out.print(" ");
        }
    }

    public static void rotateLeft(int ar[],int noRotate){
        for(int i=0;i<noRotate;i++){
            int temp=ar[0];
            for(int j=0;j<ar.length-1;j++){
                ar[j]=ar[j+1];
            }
            ar[ar.length-1]=temp;
        }
    }

    public static void rotateRight(int ar[],int noRotate){
        for(int i=0;i<noRotate;i++){
            int temp=ar[ar.length-1];
            for(int j=ar.length-1;j>0;j--){
                ar[j]=ar[j-1];
            }
            ar[0]=temp;
        }
    }


}

