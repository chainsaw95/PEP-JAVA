import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {

    public static void main(String[] args){

        Path path1=Paths.get("JUN25/input.txt");

        //path1.toFile().isDirectory()
        //path1.toFile().isFile()

        System.out.println(path1.toAbsolutePath());


    }


}
