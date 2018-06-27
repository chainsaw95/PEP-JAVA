import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

public class FileNIO {

    public static void main(String[] args) throws Exception{


        ReadableByteChannel in=Channels.newChannel(System.in);
        WritableByteChannel out=Channels.newChannel(System.out);

        ByteBuffer buffer1=ByteBuffer.allocate(128);


        int count=0;

        while(in.read(buffer1)>0){

            System.out.println(count++);
            buffer1.flip();
            out.write(buffer1);
            buffer1.flip();

        }


        System.out.println("Program over");
        
    }

}
