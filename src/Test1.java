import java.time.LocalDate;

public class Test1 {
    enum weekDay{
        Mon, Thus, Wends, Thur, Fri, Sater, Sun
    }

    public static void main(String[] args){
        weekDay week = weekDay.Mon;
        LocalDate localDate = LocalDate.now();
        LocalDate nextDate = localDate.plusDays(10000);

        System.out.println(nextDate);
        System.out.println(week);
        System.out.println(localDate);
    }
}
