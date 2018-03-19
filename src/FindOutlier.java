/**
 *  Find The Parity Outlier
 * 
 * You are given an array (which will have a length of at least 3, but could be very large) containing integers. The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N. Write a method that takes the array as an argument and returns this "outlier" N.
 * Examples
 * [2, 4, 0, 100, 4, 11, 2602, 36]
 * Should return: 11 (the only odd number)
 * 
 * [160, 3, 1719, 19, 11, 13, -21]
 * Should return: 160 (the only even number)
 * 
 * https://www.codewars.com/kata/5526fc09a1bbd946250002dc
 * 
 * @author Yuliamz
 */
public class FindOutlier {
    public static void main(String[] args) {
             int[] exampleTest1 = {2,6,8,-10,3}; 
     int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781}; 
     int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
        System.out.println(find(exampleTest1));
        System.out.println(find(exampleTest2));
        System.out.println(find(exampleTest3));
    }
    //Kata Method
    static int find(int[] integers){
        int pair=0,odd=0;   
        for (int integer : integers) {
            if(integer%2==0){
                pair++;
                if (pair==2) for (int val : integers) if (val%2!=0) return val;
            }else{
                odd++;
                if (odd==2) for (int val : integers) if (val%2==0) return val;
            }   
        }
        return 0;
    }
}
