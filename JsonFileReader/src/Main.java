import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.jsonFileReader();
    }

    public void jsonFileReader() throws Exception {
        String outputString=null;
        try {
            String filePath = System.getenv("CONF_DIR");
            Path fileName = Path.of(filePath + "//serviceconfig.json");

            System.out.println(filePath);
            System.out.println(fileName);

            File f = new File(fileName.toUri());
            System.out.println(f);
            if (!f.exists()) {
                throw new Exception("File is not present");
            }

            // Now calling Files.readString() method to
            // read the file
            outputString = Files.readString(fileName);
            System.out.println(outputString);
            if (outputString == null || outputString.isEmpty()) {
                throw new Exception("Data is not present");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
