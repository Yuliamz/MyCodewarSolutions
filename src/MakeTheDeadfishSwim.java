import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 *  Make the Deadfish Swim
 * Write a simple parser that will parse and run Deadfish.
 *
 * Deadfish has 4 commands, each 1 character long:
 *
 * i increments the value (initially 0)
 * d decrements the value
 * s squares the value
 * o outputs the value into the return array
 * Invalid characters should be ignored.
 *
 * Deadfish.parse("iiisdoso") =- new int[] {8, 64};
 * <a href="https://www.codewars.com/kata/51e0007c1f9378fa810002a9">MakeTheDeadfishSwim</a>
 *
 * @author Yuliamz
 */
public class MakeTheDeadfishSwim {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(parse("iiisdoso")));
    }
    public static int[] parse(String data) {
        List<Integer> list = new ArrayList<>();
        int number = 0;
        char[] chars = data.toCharArray();
        for (char aChar : chars) {
            switch (aChar) {
                case 'i' -> number++;
                case 'd' -> number--;
                case 's' -> number *= number;
                case 'o' -> list.add(number);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
