import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

/**
 *  Count the days!
 * Little Annie is very excited for upcoming events. She wants to know how many days she has to wait for a specific event.
 *
 * Your job is to help her out.
 *
 * Task: Write a function which returns the number of days from today till the given date. The function will take a Date object as parameter. You have to round the amount of days.
 *
 * If the event is in the past, return "The day is in the past!"
 * If the event is today, return "Today is the day!"
 * Else, return "x days"
 *
 * <a href="https://www.codewars.com/kata/5837fd7d44ff282acd000157">...</a>
 *
 * @author Yuliamz
 */
public class CountTheDays {

    public static void main(String[] args) {
        System.out.println(countDays(new Date(2022-1900, Calendar.APRIL,9)));
    }
    public static String countDays(Date d){
        if (d.before(new Date())) return "The day is in the past!";
        long days = ChronoUnit.DAYS.between( new Date().toInstant(),d.toInstant());
        if (days==0) return "Today is the day!";
        else return days+" days";
    }
}
