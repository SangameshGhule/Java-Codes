class Main {
    void sample(int a, int b) {
        System.out.println("Method of the Super class");
    }
}
public class MethodOverriding extends Main {
    void sample(int a, float b) {
        System.out.println("Method of the Sub class");
    }

    void sample(int a, int b) {
        System.out.println("Method of the sub class and Super class");
    }



    public static void main(String args[]) {
        MethodOverriding obj = new MethodOverriding();
        obj.sample(20, 20);
    }
}