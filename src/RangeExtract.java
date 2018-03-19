
import java.util.ArrayList;
import java.util.List;

/**
 * Range Extraction
 *
 * A format for expressing an ordered list of integers is to use a comma
 * separated list of either individual integers or a range of integers denoted
 * by the starting integer separated from the end integer in the range by a
 * dash, '-'. The range includes all integers in the interval including both
 * endpoints. It is not considered a range unless it spans at least 3 numbers.
 * For example ("12, 13, 15-17") Complete the solution so that it takes a list
 * of integers in increasing order and returns a correctly formatted string in
 * the range format.
 *
 * Example:
 *
 * Solution.rangeExtraction(new int[] {-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9,
 * 10, 11, 14, 15, 17, 18, 19, 20}) # returns "-6,-3-1,3-5,7-11,14,15,17-20"
 *
 * https://www.codewars.com/kata/range-extraction/
 *
 * @author Yuliamz
 */
public class RangeExtract {

    public static void main(String[] args) {
        System.out.println(rangeExtraction(new int[]{-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20,25}));
    }

    //Kata Method
    public static String rangeExtraction(int[] arr) {
        StringBuilder sb = new StringBuilder();
        List<Integer> l = new ArrayList<>();
        int i=0;
        for (;i < arr.length - 1; i++) {
            if (arr[i]+1!=arr[i+1]) {
                sb.append(arr[i]).append(",");
            }else{
                while (i<arr.length-1 && (arr[i] + 1 == arr[i + 1])) {
                    l.add(arr[i]);
                    i++;
                }
                l.add(arr[i]);
                sb.append(l.get(0)).append((l.size() > 2 ? "-" : ",")).append(l.get(l.size() - 1)).append(",");
                l.clear();
            }   
        }
        if (i<arr.length) return sb.append(arr[i]).toString();
        return sb.deleteCharAt(sb.length()-1).toString();
    }
}
