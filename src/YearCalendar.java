import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class YearCalendar {
    public static void draw_year(int year){
        for(int month = 1; month<= 12; month++) {
            System.out.println(month + "月份");
            draw_month(year, month);
        }
    }
    public static void draw_month(int year, int month){
        LocalDate date = LocalDate.of(year, month, 1);
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i<value; i++)
            System.out.print("    ");
        while(date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            System.out.print(" ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1)
                System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 1)
            System.out.println();
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("which years' calendar do u wanna? :");
        int year = scanner.nextInt();
        draw_year(year);
    }
}
