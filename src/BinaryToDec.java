
import java.util.ArrayList;
import java.util.List;
/**
 *  Ones and Zeros
 * 
 * Given an array of one's and zero's convert the equivalent binary value to an integer. 
 * Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1
 * Examples:
 * Testing: [0, 0, 0, 1] ==> 1
 * Testing: [0, 0, 1, 0] ==> 2
 * Testing: [0, 1, 0, 1] ==> 5
 * Testing: [1, 0, 0, 1] ==> 9
 * Testing: [0, 0, 1, 0] ==> 2
 * Testing: [0, 1, 1, 0] ==> 6
 * Testing: [1, 1, 1, 1] ==> 15
 * Testing: [1, 0, 1, 1] ==> 11
 * Note: you shouldn't mutate the input
 * 
 * https://www.codewars.com/kata/ones-and-zeros/java
 * 
 * @author Yuliamz
 */
public class BinaryToDec {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(1);
        integers.add(1);
        System.out.println(ConvertBinaryArrayToInt(integers));
    }
    //Kata Method
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        StringBuilder sb = new StringBuilder();
        binary.forEach(sb::append);
        return Integer.parseInt(sb.toString(), 2);


    }
    
}
