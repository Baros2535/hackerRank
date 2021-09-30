import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class StringManup {
    public static void main(String[] args) {
        String str="BarışBurakMutlu";
        String start="Burak";
        String [] strArray=str.split(start);
        System.out.println("strArray[1] = " + strArray[1]);

        System.out.println("str.substring(str.indexOf(start)+start.length()) = " + str.substring(str.indexOf(start) + start.length()));
        System.out.println("LocalDate.now().minus(1, ChronoUnit.MONTHS) = " + LocalDate.now().minus(1, ChronoUnit.MONTHS));



    }
}
