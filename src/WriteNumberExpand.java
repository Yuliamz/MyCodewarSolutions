/**
 * Write Number in Expanded Form 
 * 
 * You will be given a number and you will need to return it as a string in Expanded Form. For example:
 * Kata.expandedForm(12); # Should return "10 + 2"
 * Kata.expandedForm(42); # Should return "40 + 2"
 * Kata.expandedForm(70304); # Should return "70000 + 300 + 4"
 * NOTE: All numbers will be whole numbers greater than 0. 
 * 
 * https://www.codewars.com/kata/5842df8ccbd22792a4000245
 * 
 * @author Yuliamz
 * 
 */
public class WriteNumberExpand {
    
    public static void main(String[] args) {
        System.out.println(expandedForm(9000000));
    }
    //Kata Method
    public static String expandedForm(int num){
      String t = String.valueOf(num);
      StringBuilder buf = new StringBuilder();
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i)!='0') {
                buf.append(t.charAt(i));
                for (int j = i; j < t.length()-1; j++) buf.append("0");
                buf.append(" + ");
            }
        }
        buf.setLength(buf.length()-3);
        
      return buf.toString();
    }
}
