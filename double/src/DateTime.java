import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime {

    public static void main(String[] args) {
        System.out.println("Hello");

        System.out.println(LocalDate.now());


        LocalDate b= LocalDate.now();
        LocalDate a= LocalDate.now();
        a=a.plusDays(4);   //deliverydate
        System.out.println(a);
        System.out.println(a.compareTo(b));

        if(a.compareTo(b)>0){
            System.out.println("processed");
        }
    }

}
