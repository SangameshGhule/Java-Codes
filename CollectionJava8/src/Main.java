import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<>(List.of("Sangamesh", " ", "MayankNagar", "Nagraj", "Amulya", "Thamil"));

        //1st One checking with the length
        List<String> ls = str.stream().filter(x -> x.length() > 7).collect(Collectors.toList());
        System.out.println(ls);
        //or
        List<String> length = new ArrayList<>();
        for (String s : str) {
            if (s.length() > 7) {
                length.add(s);
            }
        }
        System.out.println("---------------------------------");


        //2nd checking length count
        str.forEach(x -> System.out.print(x.length() + " "));
        System.out.println();
        //or
        for (String s : str) {
            System.out.print(s.length() + " ");
        }
        System.out.println();
        System.out.println("---------------------------------");

        long cout = str.stream().filter(String::isEmpty).count();
        //long cout=str.stream().filter(x->x.isEmpty()).count(); both are same above and belove
        long cout1 = str.stream().filter(String::isBlank).count();
        System.out.println(cout);
        System.out.println(cout1);


        System.out.println("*****************************************************");

        ArrayList<Integer> intr = new ArrayList<>(List.of(3, 5, 2, 7, 8, 4, 3, 9, 6));
        int len = intr.size();

        List<Integer> ls1 = intr.stream().sorted().collect(Collectors.toList());
        int b = intr.stream().sorted().collect(Collectors.toList()).get(0);
        int c = ls1.stream().min(Integer::compare).get();
        System.out.println(ls1);
        System.out.println(b);
        System.out.println(c);
        int a = ls1.get(0); //min value
        System.out.println(a);

        int e = ls1.stream().sorted().collect(Collectors.toList()).get(len - 1);
        int d = ls1.stream().max(Integer::compare).get();
        System.out.println(d);
        System.out.println(e);

        List<Integer> ls2 = ls1.stream().filter(x -> x < 5).collect(Collectors.toList()).stream().filter(x -> x == 3).collect(Collectors.toList());
        System.out.println(ls2);

        List<Integer> btwwrds = ls1.stream().filter(x -> x <= 9 && x > 5).collect(Collectors.toList());
        System.out.println(btwwrds);

        for (int f : ls1.stream().distinct().collect(Collectors.toList())) {
            if (f > 5 && f <= 9) {
                System.out.print("*" + f);
            }
        }
        System.out.println();

        //Map
        List<String> str2 = str.stream().map(String::toUpperCase).collect(Collectors.toList()).stream().sorted().collect(Collectors.toList());
        System.out.println(str2);

        List<Integer> sumList = ls1.stream().map(i -> i + i).collect(Collectors.toList());
        System.out.println(sumList);



        System.out.println("*****************************************************");

        ArrayList<Integer> integr = new ArrayList<>(List.of(3, 5, 2, 7, 8, 4, 3, 9, 6));
        int aa = integr.stream().max(Integer::compare).get();
        int bb = integr.stream().min(Integer::compare).get();

        //Shows max,min,avg and sum of these values usig inputSummaryStatistics
        IntSummaryStatistics stats = integr.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println(stats);

        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        for (int cost : costBeforeTax) {
            double price = cost + .12 * cost;
            System.out.print(price+" ");
        }
        // With Lambda expression:
        costBeforeTax.stream().map( (cost) -> cost + .12 * cost).forEach(System.out::print);
        System.out.println();

        //Using before java 8 and after java 8 versions
        double total = 0;
        for(int f:costBeforeTax){
            double g=f+.12*f;
            total=total+g;
        }
        System.out.println(total);

        double dbl= costBeforeTax.stream().map(cost->cost+0.12*cost).reduce(Double::sum).get();
        System.out.println(dbl);
    }
}