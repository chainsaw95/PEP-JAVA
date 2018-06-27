import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;
import java.util.Scanner;

public class SumOfFileMatrix {

    public static void main(String[] args){


        try {

            FileReader fin1 = new FileReader("JUNE22/src/file1.txt");
            FileReader fin2 = new FileReader("JUNE22/src/file2.txt");

            FileWriter fout=new FileWriter("JUNE22/src/output.txt");

            BufferedReader b1=new BufferedReader(fin1);
            BufferedReader b2=new BufferedReader(fin2);

            Scanner sc1=new Scanner(b1);
            Scanner sc2=new Scanner(b2);

            for(int i=0;i<3;i++){

                for(int j=0;j<3;j++){

                 int n=sc1.nextInt()+sc2.nextInt();
                 fout.write(n+" ");

                }

                fout.write("\n");
            }

            System.out.println("Matrix added");

            fout.close();
            fin1.close();
            fin2.close();
            sc1.close();
            sc2.close();
            b1.close();
            b2.close();

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
