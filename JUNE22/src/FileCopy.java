import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileCopy {

    public static void main(String[] args){


        try{


            FileInputStream fin=new FileInputStream("JUNE22/src/myinput.txt");
            FileOutputStream fout=new FileOutputStream("JUNE22/src/output.txt");

            int ch=0;

            while(ch!=-1){

                ch=fin.read();
               // if(ch==-1) break;
                fout.write(ch);

            }

            fin.close();
            fout.close();

        }
        catch (Exception f){

            System.out.println(f);

        }

        System.out.println("File finished");
    }


}
