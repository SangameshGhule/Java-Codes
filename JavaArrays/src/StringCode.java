import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringCode {

    private static String name;
    private static String name1;

    public static void main(String[] args) {

        StringBuilder output = new StringBuilder("{}");
        System.out.println("^"+ output.insert(1,"Sangamesh"));
        output.append("Sangamesh");
        System.out.println(output);

        char[] e=output.toString().toCharArray();
        System.out.println(e);
        System.out.println(output.charAt(5));
        char o= Arrays.toString(e).charAt(5);
        System.out.println(o);


        String name1 = "Sangamesh";
        char[] r = name1.toCharArray();
        int n = name1.length();

        for (char chetan : r) {
            System.out.print("*" + chetan + "*");
        }
        System.out.println();
        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i]);
        }

        System.out.println();
        System.out.println(name1.length());
        System.out.println(name1.charAt(0));
        System.out.println(name1.charAt(n - 1));
        System.out.println(name1.toLowerCase());
        System.out.println(name1.toUpperCase());

        char[] a = name1.toCharArray();
        System.out.println(a.length);
        System.out.println(a);
        System.out.println(name1.lastIndexOf(6));
        System.out.println(name1.lastIndexOf(6));

        StringBuffer sb = new StringBuffer("Sangamesh");
        sb.replace(1, 5, "Java");
        System.out.println(sb);//prints SJavagamesh

        //Storing string in key-value pair using map
        String str = "Hello";
        Map<Character, Integer> mp = new HashMap<>();
        char[] ch = str.toCharArray();
        for (char c : ch) {
            if (!mp.containsKey(c)) {
                mp.put(c, 1);
            } else {
                int count = mp.get(c);
                mp.put(c, count + 1);
            }
        }
        System.out.println(mp);

        Map<String, Integer> mp1 = new HashMap<>();
        mp1.put("sangamesh", 1);
        mp1.put("Mayank", 2);
        System.out.println(mp1);
        System.out.println(mp1.size());

        if (!mp1.containsValue(3)) {
            System.out.println("Not available");
        }

        if (mp1.containsKey("sangamesh")) {
            System.out.println("Available");
        } else {
            System.out.println("Not Available");
        }


        StringBuffer sbb = new StringBuffer();
        sbb.append("Hello World ");
        sbb.append(':');
        sbb.append(true);
        sbb.append("\n\n");
        sbb.append(ch);

        String sbb1 = "Hello World " + ':' + true + "\n\n" +
                String.valueOf(ch);
        System.out.println("-----");
        System.out.println(sbb1);
        if (sbb1.contains("Hello")) {
            System.out.println("Contains HEllo word");
        }
        System.out.println("*" + sbb1);
        System.out.println(sbb.substring(6, sbb1.length() - 1));
        System.out.println("$" + sbb1.lastIndexOf('W'));
        System.out.println("$" + sbb1.lastIndexOf('l'));
        System.out.println("#" + sbb1.lastIndexOf("Hello"));
        System.out.println(sbb1.compareToIgnoreCase("wolrd"));
        System.out.println(sbb);
        System.out.println("Hello world!");
    }
}