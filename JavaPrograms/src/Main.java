import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main m1 = new Main();
        m1.atm();
        m1.sku();
    }

    void atm() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of test cases");
        int n = sc.nextInt();
        System.out.println("Enter the amount");
        int amount = sc.nextInt();

        while (n-- > 0) {
            System.out.println("give array size and give elements");
            int a1 = sc.nextInt();
            //array of size array
            int[] arr = new int[a1];
            for (int i = 0; i < a1; i++) {
                arr[i] = sc.nextInt();
                if (amount >= arr[i]) {
                    amount = amount - arr[i];
                    if (amount >= 0) {
                        System.out.print(1);
                    }
                } else
                    System.out.print(0);
            }
        }
        System.out.println("Hello world!");
        System.out.println("********************************************");
    }

    void sku() {
        Scanner sc=new Scanner(System.in);
        int maintain = 100;
        int finalCount;
        int leftItems = 0;
        int dd = 0;

        System.out.println("How many product left in warehouse ");
        int product = sc.nextInt();
        System.out.println("How many need to deliver");
        int pass = sc.nextInt();

        if (product < pass) {
            dd = pass - product;
            System.out.println("we need still " + dd + " items to deliver");
            int needToSend = sc.nextInt();
            finalCount = product + dd;
            System.out.println("delivered items " + finalCount);
            if (dd < needToSend) {
                int totalProducts = product + needToSend;
                leftItems = totalProducts - finalCount;
                System.out.println("Now how many left in warehouse " + leftItems);
            }
        } else {
            finalCount = pass;
            System.out.println("delivered items " + finalCount);
            leftItems = product - finalCount;
            System.out.println(leftItems + " items left in the warehouse");
        }

        if (leftItems <= maintain) {
            int addToWarehouse = maintain - leftItems;
            System.out.println("Please send " + addToWarehouse + " to maintain balance items in the warehouse");
        }
        System.out.println("********************************************");
    }
}
