import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *  Sort the odd
 * 
 * You have an array of numbers. 
 * Your task is to sort ascending odd numbers but even numbers must be on their places.
 * 
 * Zero isn't an odd number and you don't need to move it. If you have an empty array, you need to return it.
 * 
 * Example
 * 
 * sortArray([5, 3, 2, 8, 1, 4]) == [1, 3, 2, 8, 5, 4]
 * 
 * https://www.codewars.com/kata/sort-the-odd
 * 
 * @author Yuliamz
 */
public class SortOdd {
 
    public static void main(String[] args) {
//        System.out.println(sortArray(new int[]{ 5, 3, 2, 8, 1, 4 }));
        Arrays.toString(sortArray(new int[]{ 5, 3, 2, 8, 1, 4 }));
    }
    
    public static int[] sortArray(int[] array) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2!=0) al.add(array[i]);
        }
        Collections.sort(al);
        int pos=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2!=0){
                array[i]=al.get(pos);
                pos++;
            }
        }
    return array;
  }
    
    
}
