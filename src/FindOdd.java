/**
 *
 *  Find the odd int
 * 
 * Given an array, find the int that appears an odd number of times.
 * There will always be only one integer that appears an odd number of times.
 * 
 * https://www.codewars.com/kata/54da5a58ea159efa38000836
 * 
 * @author Yuliamz
 */
public class FindOdd {
    
    
    public static void main(String[] args) {
        System.out.println(FindOdd.findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
    }
    
    //Kata Method
    public static int findIt(int[] A) {
        int count,odd=0;    
        for (int i = 0; i < A.length; i++) {
            count=0;
            for (int j = 0; j < A.length; j++) {
                if (A[i]==A[j]) count++;
            }
            if (count%2!=0) {
                odd=A[i];
                break;
            }
        }
        return odd;
  	
  }
    
}
