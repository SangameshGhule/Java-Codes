import java.time.LocalDate;
import java.time.LocalDateTime;

public class FirstDemo4 {

    public static void main(String[] args) {

        Employee2 e1 = new Employee2(1,"sanga","10:18:12");

    }
}

    class Employee2 {
        int id;

        public Employee2(int id, String name, String localDateTime) {
            this.id = id;
            this.name = name;
            this.localDateTime = localDateTime;
        }

        String name;
        String localDateTime;
}
