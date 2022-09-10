import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

/**
 *  Minutes To Midnight
 * Teemo is not really excited about the new year's eve, but he has to celebrate it with his friends anyway.
 * He has a really big passion about programming and he wants to be productive till midnight. He wants to know how many minutes he has left to work on his new project.
 * He doesn't want to look on the clock all the time, so he thought about a function, which returns him the number of minutes.
 * Can you write him a function, so he can stay productive?
 * The function minutesToMidnight(d) will take a date object as parameter. Return the number of minutes in the following format:
 * "x minute(s)"
 * You will always get a date object with of today with a random timestamp.
 * You have to round the number of minutes.
 * Milliseconds doesn't matter!
 * Some examples:
 * 10.00 am => "840 minutes"
 * 23.59 pm => "1 minute"
 * <a href="https://www.codewars.com/kata/58528e9e22555d8d33000163">MinutesToMidnight</a>
 *
 * @author Yuliamz
 */
public class MinutesToMidnight {

    public static void main(String[] args) {
        System.out.println(countMinutes(new Date()));
    }
    public static String countMinutes(Date d){
        long minutes = ChronoUnit.MINUTES.between( d.toInstant(), LocalDate.now().atStartOfDay().plusDays(1).toInstant(ZoneOffset.UTC));
        return minutes+" minute"+(minutes==1?"":"s");
    }
}
