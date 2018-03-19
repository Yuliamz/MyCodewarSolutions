/**
 *  Strip Comments
 * 
 * Complete the solution so that it strips all text that follows any of a set of comment markers passed in. Any whitespace at the end of the line should also be stripped out.
 * 
 * Example:
 * 
 * Given an input string of:
 * 
 * apples, pears # and bananas
 * grapes
 * bananas !apples
 * The output expected would be:
 * 
 * apples, pears
 * grapes
 * bananas
 * The code would be called like so:
 * 
 * var result = solution("apples, pears # and bananas\ngrapes\nbananas !apples", ["#", "!"])
 * // result should == "apples, pears\ngrapes\nbananas"
 * 
 * https://www.codewars.com/kata/51c8e37cee245da6b40000bd
 * 
 * @author Yuliamz
 */
public class StripComments {

    public static void main(String[] args) {
        System.out.println(stripComments("a \n b \nc ", new String[] { "#", "$" }));
    }

    public static String stripComments(String text, String[] commentSymbols) {
        String[] lines = text.split("\n");
        int f;
        for (int i = 0; i < lines.length; i++) {
            for (String commentSymbol : commentSymbols) {
                if ((f = lines[i].indexOf(commentSymbol)) != -1) {
                    lines[i] = lines[i].substring(0, f);
                }
                lines[i]=lines[i].replaceAll("\\s+$", "");
            }
        }
        return String.join("\n", lines);
    }
}
