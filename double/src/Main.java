import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        String a="10.456767885";
//        System.out.println(a);
//
//        Formatter fm=new Formatter();
//        String.format(a, "%.1f");
//        fm.format("%.5f", Double.parseDouble(a));
//        System.out.println(fm);
//        fm.close();

        String name="100.72";
        String name1="  100.3782367326732243";

        if(name1.substring(name1.lastIndexOf(".")+1).length()>5){
            System.out.println("sssssss");
        }
        if(name1.isBlank()){
            System.out.println("ssss");
        }
//        String substring = name.substring(0, name.lastIndexOf("."));
//        System.out.println(substring);
//        String substring1 = name.substring(name.lastIndexOf(".")).substring(0, 6);
//        System.out.println(substring1);
//        String aaa=substring+substring1;
//        System.out.println(aaa);
        System.out.println(name.substring(name.lastIndexOf(".")+1));
        if(name.substring(name.lastIndexOf(".")+1).length()>5) {
            name.substring(0, name.lastIndexOf(".") + 6);
            System.out.println(name.substring(0, name.lastIndexOf(".") + 6));
        }
//        String substring2 = name.substring(0, name.lastIndexOf("."))+name.substring(name.lastIndexOf(".")).substring(0, 6);
//        System.out.println(substring2);
    }

}