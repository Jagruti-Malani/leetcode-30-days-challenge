package AprilChallenge.week2;
import java.util.*;

public class _13_ContiguousArray {
    /*
        Time Complexity : O(N)
        Space Complexity : O(N)
    */
    public static int findMaxLength(int[] arr) {
        if(arr == null || arr.length == 0) return 0;
       
        HashMap<Integer, Integer> map = new HashMap<>(); 
        int max = 0, sum = 0;
        map.put(0, -1); 
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] == 0 ? -1 : 1;
           
            if (map.containsKey(sum))
                max = Math.max(max, i - map.get(sum));
            else {
                map.put(sum, i);                
            }
        }
        
		return max;
    }

    public static void main(String[] args) {
        System.out.println(findMaxLength(new int[] {1,1,1,0,0,1,0 }));
    }
}