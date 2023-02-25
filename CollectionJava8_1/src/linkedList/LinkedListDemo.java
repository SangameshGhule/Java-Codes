package linkedList;

import arrayList.Employee;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo  {

    public static void main(String[] args) {

        LinkedList<Employee> employees=new LinkedList<>();
        employees.add(new Employee("sangu",26,50000.0));
        employees.add(new Employee("veer",27,60000.0));
        employees.add(new Employee("veer",24,70000.0));
        employees.add(new Employee("veer",26,70000.0));
        employees.add(new Employee("veer",24,870000.0));
        employees.add(new Employee("veer",29,70000.0));
        System.out.println(employees);

        employees.get(0);

    }
}


