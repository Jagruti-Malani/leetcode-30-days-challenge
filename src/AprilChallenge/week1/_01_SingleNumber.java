package AprilChallenge.week1;

public class _01_SingleNumber {
    /*
        Time Complexity : O(N)
        Space Complexity : O(1)
    */
    public static int singleNumber(int[] nums) {        
        int result = 0;
        
        for(int i = 0; i < nums.length; i++)
            result ^= nums[i];
        
        return result;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[] {4,1,2,1,2}));
    }
}