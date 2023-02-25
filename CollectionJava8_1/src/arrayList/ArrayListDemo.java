package arrayList;

import java.util.ArrayList;
import java.util.Collections;
public class ArrayListDemo {

    public static void main(String[] args) {
        System.out.println("Hello world");

        ArrayList a1=new ArrayList();
        a1.add(101);
        a1.add("Sangamesh");
        a1.add(50000);
        System.out.println(a1);
        a1.remove(1);
        System.out.println(a1);


        ArrayList a2=new ArrayList();
        a2.add(102);
        a2.add("Shreedhaar");
        System.out.println(a2);
        a2.addAll(a1);
        System.out.println(a2);
        a2.addAll(a1.size(), Collections.singleton("middle"));
        System.out.println(a2);


        ArrayList<Integer> a3=new ArrayList<>();
        a3.add(101);
        a3.add(102);
        a3.add(Integer.valueOf("106"));
        a3.add((int) 107.05);
        System.out.println(a3);

        ArrayList<Double> a4=new ArrayList<>();
        a4.add(Double.valueOf(101));
        a4.add(Double.valueOf("102"));
        a4.add(Double.valueOf("106.99"));
        a4.add(Double.valueOf("899"));
        System.out.println(a4);

        ArrayList<String> a5= new ArrayList<>();
        a5.add(String.valueOf(44));
        a5.add(String.valueOf('c'));
        a5.add(("49"));
        System.out.println(a5);

        ArrayList<Employee> employees=new ArrayList<>();
        employees.add(new Employee("sangu",26,50000.0));
        employees.add(new Employee("veer",28,70000.0));
        employees.add(new Employee("veer",28,70000.0));
        System.out.println(employees);

        employees.add(0,new Employee("jagu",24,40000.0));
        System.out.println(employees);

        employees.addAll(employees.size()-1,employees);
        System.out.println(employees.size());

        employees.remove(employees.size()-1);
        System.out.println(employees.size());
        System.out.println(employees);

        employees.removeAll(employees.subList(4,6));
        System.out.println(employees.size());
        System.out.println(employees);

    }
}

