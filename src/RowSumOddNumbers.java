/**
 *  Sum of odd numbers
 *
 Given the triangle of consecutive odd numbers:

 1
 3     5
 7     9    11
 13    15    17    19
 21    23    25    27    29
 ...
 Calculate the sum of the numbers in the nth row of this triangle (starting at index 1) e.g.: (Input --> Output)

 1 -->  1
 2 --> 3 + 5 = 8
 * <p>
 * <a href="https://www.codewars.com/kata/55fd2d567d94ac3bc9000064">Sum of odd numbers</a>
 *
 * @author Yuliamz
 */
public class RowSumOddNumbers {
    
    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(42));
        
    }
    public static int rowSumOddNumbers(int n) {
        return n * n * n;
    }
    
}
