import java.util.Arrays;

public class ArraysCode {
    public static void main(String[] args) {

        int[] a = {10, 20, 3, 4, 7, 1, 22, 3, 4, 20};

        //SORTING
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];  //10
                    a[i] = a[j];  //3
                    a[j] = temp;  //10
                }
            }
            System.out.println(a[i]);
        }

        System.out.println("---------------");

        System.out.println("---------------");

        //DUPLICATE VALUES
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[i]);
                    count++;
                }
            }
        }
        System.out.println(count);


        //TO PRINT ALL ELEMENTS
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println("------------------");

        //ADD ALL VALUES IN NEW ARRAYS
        int res[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            res[i] = a[i];
            System.out.println(res[i]);
        }

        System.out.println("------------------");

        //EVEN AND ODD ELEMETS
        int e[] = new int[a.length];
        int o[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                e[i] = a[i];
                System.out.println(e[i]);
            } else {
                o[i] = a[i];
                System.out.println(o[i]);
            }
        }

        System.out.println("---------------");

        //MAX & MIN value
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }

            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

        System.out.println("---------------");


        //SORT ARRAY BUILT IN MEHTOD
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println("---------------");

        //Descending order
        Arrays.sort(a);
        for (int j = a.length - 1; j >= 0; j--) {
            System.out.println(a[j]);
        }


        System.out.println("---------------*");
        int f[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[1] != a[j]) {
                    System.out.println(a[i]);
                }
            }
        }


        System.out.println("---------------");

        System.out.println("Hello W orld");
        System.out.println("Hello world!");
    }
}