import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        m.patt(sc.nextInt());
        System.out.println("Hello world!");
    }

    void patt(int N) {
        int j = 0;

        for (int i = 0; i < N; i++) {
            for (j = i; j <= i; j++) {
                System.out.print("\\");
            }
            if (i == 0) {
                System.out.print("   ");
            }
            if (i == 1) {
                System.out.print("  ");
            }
            if (i == 2) {
                System.out.print(" ");
            }
            System.out.println("/");
        }

    }
}