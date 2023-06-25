import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTime {

    public static void main(String[] args) {

        LocalDate a= LocalDate.now().plusDays(3);   // expected arrival date
        LocalDate b= LocalDate.now().plusDays(3);   // Promised delivery date
//
//        if(a.compareTo(b)<0){
//            System.out.println("PRocessed");
//        }else{
//            System.out.println("Rejected");
//        }

        System.out.println(a.toString());
        System.out.println(b.toString());

        System.out.println((a.compareTo(b)));
        System.out.println(a.toString().compareTo(b.toString()));

        if(a.toString().compareTo(b.toString())<0){
            System.out.println("PRocessed");
        }else{
            System.out.println("Rejected");
        }

    }
}
