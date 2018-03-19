/**
 *  Triple trouble
 * 
 * Write a function
 * 
 * TripleDouble(long num1, long num2)
 * which takes in numbers num1 and num2 and returns 1 if there is a straight triple of a number at any place in num1 and also a straight double of the same number in num2.
 * For example:
 * TripleDouble(451999277, 41177722899) == 1 // num1 has straight triple 999s and 
                                          // num2 has straight double 99s
 * TripleDouble(1222345, 12345) == 0 // num1 has straight triple 2s but num2 has only a single 2
 * TripleDouble(12345, 12345) == 0
 * TripleDouble(666789, 12345667) == 1
 * If this isn't the case, return 0
 * 
 * https://www.codewars.com/kata/triple-trouble-1/java
 * 
 * @author Yuliamz
 */
public class TripleTrouble {
    
    
    public static void main(String[] args) {
        System.out.println(TripleDouble(451999277L, 411777228L));
    }
    
    //Kata Method
    public static int TripleDouble(long num1, long num2) {
        String n1 = Long.toString(num1),n2 = Long.toString(num2);
        for (int i = 0; i < n1.length()-2; i++) {
            if (n1.charAt(i)==n1.charAt(i+1) && n1.charAt(i)==n1.charAt(i+2)) {
                for (int j = 0; j < n2.length()-1; j++) {
                    if (n1.charAt(i)==n2.charAt(j) && n1.charAt(i)==n2.charAt(j+1)) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
    
}
