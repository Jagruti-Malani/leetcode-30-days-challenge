package AprilChallenge.week1;

public class _03_MaximumSubarray {
    /*
        Time Complexity : O(N)
        Space Complexity : O(1)
    */
    public static int maxSubArray(int[] arr) {
        int max_so_far = Integer.MIN_VALUE;
        int n = arr.length;
        
        for(int i = 0; i < n; i++) {
            arr[i] = Math.max(arr[i], arr[i] + (i > 0 ? arr[i-1] : 0));
            max_so_far = Math.max(max_so_far, arr[i]);
        }

        return max_so_far;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4 }));
    }
}