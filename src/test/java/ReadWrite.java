
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadWrite {


    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();
        FileInputStream inputStream = new FileInputStream("C:\\Users\\AliATES\\Desktop\\segmentify\\segmentify\\src\\main\\resources\\properties\\testData.poperties");
        properties.load(inputStream);
       System.out.println(properties.getProperty("Username"));
    }
}
