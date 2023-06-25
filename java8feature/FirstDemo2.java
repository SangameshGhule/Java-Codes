
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FirstDemo2 {

    public static void main(String[] args) throws Exception {

//		FileReader fr = new FileReader(new File("info.txt"));
//
//		BufferedReader br = new BufferedReader(fr);
//
//		String line = br.readLine();
//
//		while (line != null) {
//			System.out.println(line);
//			line = br.readLine();
//		}
//		br.close();

        String filename = "info.txt";

        try (Stream<String> stream = Files.lines(Paths.get(filename))){

            stream.forEach(line -> System.out.println(line));

        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}