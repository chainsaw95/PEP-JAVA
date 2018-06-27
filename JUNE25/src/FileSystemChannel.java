import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public class FileSystemChannel {

    public static void main(String[] args)throws IOException {

        FileInputStream fin=new FileInputStream("JUNE25/input.txt");
        FileChannel file=fin.getChannel();

        WritableByteChannel out=Channels.newChannel(System.out);
        file.transferTo(0,file.size(),out);

        fin.close();

    }

}
