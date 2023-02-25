import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

//        //Reading data in the form of Bytes[]...
//        FileInputStream inputStream = new FileInputStream("C:\\Users\\Sangamesh G\\Documents\\FileIoPath\\hello.txt");
//        int i = inputStream.read();
//        try {
//            while (i != -1) {
//                System.out.print((char) i);
//                // Reads next byte from the file
//                i = inputStream.read();
//            }
//            inputStream.close();
//        } catch (Exception e) {
//            throw new Exception();
//        }
//
//        //Writes byte to the file
//        try {
//            String data = "This is a line of text inside the file.";
//            FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Sangamesh G\\Documents\\FileIoPath\\write.txt");
//            byte[] array = data.getBytes();
//            outputStream.write(array);
//            outputStream.close();
//        }catch (Exception e){
//            throw new Exception();
//        }
//
//
//        //Java READ/WRITE charecter
//        try {
//            Reader reader = new FileReader("C:\\Users\\Sangamesh G\\Documents\\FileIoPath\\reader.txt");
//            System.out.println("Is there data in the stream?  " + reader.ready());
//            if (!reader.ready()) {
//                char[] arr = new char[25];
//                reader.read(arr);
//                System.out.println(arr);
//                reader.close();
//            }
//        }catch (Exception e){
//            throw new Exception(e.getMessage());
//        }
//
//        //writting data on the file
//        String data="We are writting data on to the file";
//        try {
//            Writer writer = new FileWriter("C:\\Users\\Sangamesh G\\Documents\\FileIoPath\\writer.txt");
//            char[] chararr = new char[data.length()];
//            writer.write(chararr);
//            writer.close();
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        FileReader fileReader=new FileReader("C:\\Users\\Sangamesh G\\Documents\\FileIoPath\\reader.txt");
        int read = fileReader.read();
        char[] arr=new char[read];
        fileReader.read(arr);

        System.out.println();

        String fileContent= new String(arr);
        System.out.println(fileContent);




    }
}