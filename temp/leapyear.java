import  java.time.LocalDate;
public class leapyear{
    public static void main(String[] args){
        LocalDate ld = LocalDate.now();
        int year = ld.getYear();

        if((year%4) == 0 && (year%100) != 0 || (year%400) == 0 ){
            System.out.println("This is Leap Year");
        }
        else{
            System.out.println("This is not a Leap Year");
        }
    }
}