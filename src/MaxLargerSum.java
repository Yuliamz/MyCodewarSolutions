/**
 *  Maximum subarray sum
 * 
 * The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array or list of integers:
 * 
 * Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
 * // should be 6: {4, -1, 2, 1}
 * Easy case is when the list is made up of only positive numbers and the maximum sum is the sum of the whole array. If the list is made up of only negative numbers, return 0 instead.
 * 
 * Empty list is considered to have zero greatest sum. Note that the empty list or array is also a valid sublist/subarray.
 * 
 * https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c
 * 
 * @author Yuliamz
 */
public class MaxLargerSum {

    public static void main(String[] args) {
        System.out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    //Kata Method
    public static int sequence(int[] arr) {
        int sum = Integer.MIN_VALUE, aux = 0, size = arr.length;
        if (size == 0) return 0;
        for (int i = 0; i < size; i++) {
            aux = aux + arr[i];
            if (sum < aux) sum = aux;
            if (aux < 0) aux = 0;
        }
        return sum;
    }
}
