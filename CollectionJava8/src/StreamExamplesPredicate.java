import java.util.function.Predicate;

public class StreamExamplesPredicate {

    //Lambda Expression is anonymous function (which doesn't have name,returnType and any modifier).
    //Function interface is having 4 fucntions: (Function interface having only one abstract method,its used to invoke lamda expresiion)

    //1. predicate -->condition -->true/false
    //2. Consumer  --> will not take input --> gives only output
    //3. Supplier  --> will take input --> nothing it will return
    //4. Function  --> will take input --> will return iutput

    //Predicate introduced to in java 8 to check condition statement and return TRUE/FALSE

    void add(int a, int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {

        StreamExamplesPredicate se= new StreamExamplesPredicate();
        se.add(5,5);
        se.add(10,10);

        //Using lamda adding two int
        Predicate<Integer> f=c-> c>10;
        System.out.println(f.test(15));

        String[] aa = {"aeer","somesh","shiva"," mayank","nagraj","chetan"};

        //without using lamda expression
        for (String d:aa) {
            boolean p = d.startsWith("a");
            if (p) {
                System.out.println(d);
            }
        }

        //Using Lamda checking true or false
        Predicate<String> ff=a->a.charAt(0) =='a';
        for(String a:aa){
            if(ff.test(a)){
                System.out.println(a);
            }
        }
    }
}
