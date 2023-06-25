import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstDemo1 {

    public static void main(String[] args) {

        Employee1 e1 = new Employee1(1, "Robert", 26500.00, "USA");
        Employee1 e2 = new Employee1(2, "Abraham", 46500.00, "INDIA");
        Employee1 e3 = new Employee1(3, "Ching", 36500.00, "CHINA");
        Employee1 e4 = new Employee1(4, "David", 16500.00, "INDIA");
        Employee1 e5 = new Employee1(5, "Cathy", 25500.00, "USA") ;

        List<Employee1> list = Arrays.asList(e1, e2, e3, e4, e5);

        List<Employee1> usa = list.stream().filter(a -> a.getCountry().equalsIgnoreCase("USA")).collect(Collectors.toList());
        for(Employee1 employee:usa){
            if(employee.getId()==1){
                employee.setName("Sangamesh");
            }
            System.out.println(employee);
        }

        list.stream().filter(i->i.getId()==1||i.getId()==2).forEach(employee1 ->
                {
                    if (employee1.getId() == 1) {
                        employee1.setName("Sangamesh");
                    }
                }
        );



        Map<String, List<Employee1>> data = list.stream().collect(Collectors.groupingBy(e -> e.country));

        Map<Double, List<Employee1>> collect = list.stream().collect(Collectors.groupingBy(w -> w.salary));

        System.out.println(data);
        System.out.println(collect);
    }
}

 class Employee1 {
    int id;
    String name;
    double salary;
    String country;

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public double getSalary() {
         return salary;
     }

     public void setSalary(double salary) {
         this.salary = salary;
     }

     public String getCountry() {
         return country;
     }

     public void setCountry(String country) {
         this.country = country;
     }

     @Override
     public String toString() {
         return "Employee1{" +
                 "id=" + id +
                 ", name='" + name + '\'' +
                 ", salary=" + salary +
                 ", country='" + country + '\'' +
                 '}';
     }

     public Employee1(int id, String name, double salary, String country) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.country = country;
    }

 }