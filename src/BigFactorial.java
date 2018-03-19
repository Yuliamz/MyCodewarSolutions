import java.math.BigInteger;

/**
 *  Large Factorials
 * 
 * In mathematics, the factorial of integer n is written as n!. It is equal to the product of n and every integer preceding it. For example: 5! = 1 x 2 x 3 x 4 x 5 = 120
 * Your mission is simple: write a function that takes an integer n and returns the value of n!.
 * You are guaranteed an integer argument. For any values outside the non-negative range, return null, nil or None (return an empty string "" in C and C++). For non-negative numbers a full length number is expected for example, return 25! = "15511210043330985984000000" as a string.
 *
 * For more on factorials, see http://en.wikipedia.org/wiki/Factorial
 * 
 * https://www.codewars.com/kata/557f6437bf8dcdd135000010
 * 
 * @author Yuliamz
 */
public class BigFactorial {
    
    public static void main(String[] args) {
        System.out.println(Factorial(24));
    }
    //Kata Method
    public static String Factorial(int n) {
    return  n == 1 ? "1" : BigInteger.valueOf(n).multiply(new BigInteger(Factorial(n-1))).toString();
  } 
}
