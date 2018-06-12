import java.util.Scanner;

public class MatrixMul {

    public int data[][];

    Scanner sc=new Scanner(System.in);



    MatrixMul(int r,int c){

        data=new int[r][c];


    }


    public void getinput(){

        for(int i=0;i< data.length;i++){

            for(int j=0;j< data[i].length;j++){

                data[i][j]=sc.nextInt();

            }

            System.out.println("");
        }

    }


    public void print(){

        for(int i=0;i<data.length;i++){

            for(int j=0;j<data[i].length;j++){

                System.out.print(" "+data[i][j]+" ");

            }

            System.out.println("");
        }

    }


    public MatrixMul multiply(MatrixMul a){


        MatrixMul sum=new MatrixMul(data.length,data[0].length);



        for(int i=0;i<data.length;i++) {

            for (int j = 0; j < data[0].length; j++) {

                for (int k = 0; k < sum.data.length; k++) {

                    sum.data[i][j] = sum.data[i][j]+(this.data[i][k] * a.data[k][j]);

                }
            }
        }
        return sum;

        }





    }

