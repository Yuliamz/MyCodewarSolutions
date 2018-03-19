
/**
 *  Duplicate Encoder
 * 
 * The goal of this exercise is to convert a string to a new string where each character in the new string is '(' if that character appears only once in the original string, or ')' if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.
 * Examples:
 * "din" => "((("
 * "recede" => "()()()"
 * "Success" => ")())())"
 * "(( @" => "))(("
 * 
 * https://www.codewars.com/kata/54b42f9314d9229fd6000d9c
 * 
 * @author Yuliamz
 */
public class DuplicateEncoder {
    
    public static void main(String[] args) {
        System.out.println(encode("   ()(   "));
        
    }
    static String encode(String word){
        word=word.toLowerCase();
        String aux = word;
        for (int i = 0; i < word.length(); i++) {
            aux=aux.substring(0, i)+ (count(word, word.charAt(i))==1?'(':')')+ aux.substring(i+1);
        }
        return aux;
    }
    static int count(String w, char c){
        int count = 0;
        for (int i = 0; i < w.length(); i++) if (w.charAt(i)==c) count++;
        return count;
    }
    
}
