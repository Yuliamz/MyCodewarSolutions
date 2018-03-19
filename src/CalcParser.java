import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Calculator
 * 
 * Create a simple calculator that given a string of operators (+ - * and /) and numbers separated by spaces returns the value of that expression
 * 
 * Example:
 * 
 * Calculator.evaluate("2 / 2 + 3 * 4 - 6") // => 7
 * Remember about the order of operations! Multiplications and divisions have a higher priority and should be performed left-to-right. Additions and subtractions have a lower priority and should also be performed left-to-right.
 *
 * https://www.codewars.com/kata/5235c913397cbf2508000048
 * 
 * @author Yuliamz
 */
public class CalcParser {
    public static void main(String[] args) throws ScriptException {
        evaluate("2 / 2 + 3 * 4");
    }
    //Kata Method
    public static Double evaluate(String expression) {
        try {
            return new Double(new ScriptEngineManager().getEngineByName("JavaScript").eval(expression).toString());
        } catch (ScriptException ex) {return 0.0;}
  }
}
