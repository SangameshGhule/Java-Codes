
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstDemo {

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Robert", 26500.00);
        Employee e2 = new Employee(2, "Abraham", 46500.00);
        Employee e3 = new Employee(3, "Ching", 36500.00);
        Employee e4 = new Employee(4, "David", 16500.00);
        Employee e5 = new Employee(5, "Cathy", 25500.00);

        List<Employee> list = Arrays.asList(e1, e2, e3, e4, e5);

//        Optional<Employee> max = list.stream()
//                .collect(Collectors.maxBy(Comparator.comparing(e -> e.salary)));

        Optional<Employee> max = list.stream().max(Comparator.comparing(a -> a.salary));

        System.out.println("Max Salary :: " + max.get().salary);

        Optional<Employee> min = list.stream()
                .collect(Collectors.minBy(Comparator.comparing(e -> e.salary)));

        System.out.println("Min Salary :: " + min.get().salary);

        Double avgSalary = list.stream().collect(Collectors.averagingDouble(e -> e.salary));
        System.out.println(avgSalary);
    }
}

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}