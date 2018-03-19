import java.util.Arrays;
/**
 *
 *  Highest and Lowest
 * 
 * In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
 * Example:
 * HighAndLow("1 2 3 4 5") // return "5 1"
 * HighAndLow("1 2 -3 4 5") // return "5 -3"
 * HighAndLow("1 9 3 4 -5") // return "9 -5"
 * Notes:
 * 
 * All numbers are valid Int32, no need to validate them.
 * There will always be at least one number in the input string.
 * Output string must be two numbers separated by a single space, and highest number is first.
 * 
 * https://www.codewars.com/kata/554b4ac871d6813a03000035
 * 
 * @author Yuliamz
 */
public class HigherLower {

    public static void main(String[] args) {
        System.out.println(HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

    //Kata Method
    public static String HighAndLow(String numbers) {
        String[] o = numbers.split(" ");
        int[] out = new int[o.length];
        for (int i = 0; i < o.length; i++) out[i] = Integer.parseInt(o[i]);
        Arrays.sort(out);
        String res = out[out.length - 1] + " " + out[0];
        return res;
    }

}
