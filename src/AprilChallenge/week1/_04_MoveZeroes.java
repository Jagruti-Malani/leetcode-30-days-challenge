package AprilChallenge.week1;

public class _04_MoveZeroes {
    /*
        Time Complexity : O(N)
        Space Complexity : O(1)
    */
    public static void moveZeroes(int[] nums) {
        if(nums.length == 0 || nums.length == 1) return;

        int j = 0;
     
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int tmp = nums[j];
                nums[j++] = nums[i]; 
                nums[i] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {0,1,0,3,12};
        moveZeroes(arr);
        for(int a: arr) {
            System.out.print(a + " ");
        }
    }
}