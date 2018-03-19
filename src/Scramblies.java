/**
 *  Scramblies
 * 
 * Write function scramble(str1,str2) that returns true if a portion of str1 characters can be rearranged to match str2, otherwise returns false.
 * For example:
 * str1 is 'rkqodlw' and str2 is 'world' the output should return true.
 * str1 is 'cedewaraaossoqqyt' and str2 is 'codewars' should return true.
 * str1 is 'katas' and str2 is 'steak' should return false.

 * Only lower case letters will be used (a-z). No punctuation or digits will be included.
 * Performance needs to be considered
 * 
 * https://www.codewars.com/kata/55c04b4cc56a697bb0000048
 * 
 * @author Yuliamz
 */
public class Scramblies {
    
    public static void main(String[] args) {
        System.out.println(scramble("scriptjavx","javascript"));
        
    }
    //Kata Method
    public static boolean scramble(String str1, String str2) {
        int qua;
        for (int i = 0; i < str2.length(); i++) {
            if ((qua=count(str2, str2.charAt(i)))==1) {
                if (!str1.contains(""+str2.charAt(i))) return false;
            }else if (qua>count(str1, str2.charAt(i))) return false;
        }
        return true;
    }
    static int count(String w, char c){
        int count = 0;
        for (int i = 0; i < w.length(); i++) if (w.charAt(i)==c) count++;
        return count;
    }
    
}
