package AprilChallenge.week1;
import java.util.*;

public class _07_CountingElements {
    /*
        Time Complexity : O(N)
        Space Complexity : O(N)
    */
    public static int countElements(int[] arr) {
		if(arr == null || arr.length == 0) return 0;
		
		var count = 0;
		var set = new HashSet<Integer>();
        
		for(int i = 0; i < arr.length; i++)
			set.add(arr[i]);
        
        for(int i = 0; i < arr.length; i++)				
            if(set.contains(arr[i] + 1)) count++;
        
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countElements(new int[] {2,1,3,5,9}));
    }
}