
import java.io.*; 
import java.nio.file.Files; 
import java.nio.file.*; 
public class file {

    public static void main(String[] args) throws IOException {

      try {  Path sourceDirectory = Paths.get("E:\\java\\Threading\\*****.txt"); // Enter Source Path
        Path targetDirectory = Paths.get("G:\\*****.txt");    // Enter target Path
}
catch(Exception e){
                System.out.println(e);
            }
        Files.copy(sourceDirectory, targetDirectory);

    }
}