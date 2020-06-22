package AprilChallenge.week2;
import java.util.*;

public class _12_LastStongWeight {
    /*
        Time Complexity : O(N*N)
        Space Complexity : O(1)
    */
    public static int lastStoneWeight(int[] stones) {
        int n = stones.length;
		Arrays.sort(stones);

        for(int i = 0; i < n-1; i++) {
			stones[n-i-2] = stones[n-i-1] - stones[n-i-2];
			
			for(int j = n-i-2; j > 0; j--) {
				if(stones[j] < stones[j-1]) {
					int tmp = stones[j];
					stones[j] = stones[j-1];
					stones[j-1] = tmp;
				} else break;
			}
		}
		
		return stones[0];
    }

    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[] {2,7,4,1,8,1}));
    }
}