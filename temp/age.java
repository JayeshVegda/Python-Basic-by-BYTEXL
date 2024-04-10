import java.time.LocalDate;
import java.time.Period;

public class age {
    public static void main(String [] args){
        LocalDate today = LocalDate.now();
        LocalDate birth = LocalDate.of(2003, 06, 18);
        Period p = Period.between(birth, today);
        System.out.println(p.getYears());

    }
}
