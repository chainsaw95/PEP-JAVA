import java.io.*;

public class FileReaderTest {

    public static void main(String[] args){

        try{

            FileReader fin=new FileReader("JUNE22/src/myinput.txt");
            FileWriter fout=new FileWriter("JUNE22/src/output.txt");

            BufferedReader br=new BufferedReader(fin);

            String sl=br.readLine();
            while(sl!=null){
                fout.write(sl+"\n");
                sl=br.readLine();
            }

            fin.close();
            fout.close();
            br.close();

        }
        catch (Exception f){

            System.out.println(f);

        }

        System.out.println("File finished");
    }
}
