
/**
 *  Convert string to camel case
 *
 * Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized.
 * Examples:
 * returns "theStealthWarrior"
 * toCamelCase("the-stealth-warrior")
 * returns "TheStealthWarrior"
 * toCamelCase("The_Stealth_Warrior")
 *
 * https://www.codewars.com/kata/517abf86da9663f1d2000003
 *
 * @author Yuliamz
 */
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CamelCase {

    public static void main(String[] args) {
        System.out.println(toCamelCase("the_Stealth-Warrior"));
    }
    //Kata Method
    static String toCamelCase(String s) {
        return !s.isEmpty() ? s.substring(0, 1) + Stream.of(s.split("[-_]"))
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
                .collect(Collectors.joining("")).substring(1) : "";
    }

}
