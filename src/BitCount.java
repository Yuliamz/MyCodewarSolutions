
/**
 * Bit Counting
 *
 * Write a function that takes an (unsigned) integer as input, and returns the number of bits that are equal to one in the binary representation of that number.
 * Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case
 *
 * https://www.codewars.com/kata/526571aae218b8ee490006f4
 *
 * @author Yuliamz
 */
public class BitCount {

    public static void main(String[] args) {
        System.out.println(countBits(1234));
    }

    //Kata Method
    public static int countBits(int n) {
        String binary = Integer.toBinaryString(n);
        int c = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') c++;
        }
        return c;
    }
}
