import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {

        //TO Create DIRECTORY/FOLDER
        File f=new File("folder1");
        boolean a=f.mkdir();
        System.out.println(a);

        //To Create File with diffrent format
        File f1=new File(f,"folder1.txt");  //folder.txt .pptx .pdf .png .json
        boolean b=f1.createNewFile();
        System.out.println(b);

        boolean ff=f1.isFile();
        System.out.println(ff+"*");

        //To check how many files are present in Folder
        String[] a1 =f.list();
        for(String s: Objects.requireNonNull(a1)){
            System.out.println(s);
        }

        String d= f.getAbsolutePath();
        String e= f.getPath();
        URI u = f.toURI();
        String j =f.toURI().getPath();

        System.out.println(d);
        System.out.println(e);
        System.out.println(u);
        System.out.println(j);

        boolean aa=f1.delete();
        System.out.println(aa);

        System.out.println("Hello world!");
    }
}