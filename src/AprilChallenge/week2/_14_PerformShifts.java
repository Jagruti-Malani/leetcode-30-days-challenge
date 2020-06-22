package AprilChallenge.week2;

public class _14_PerformShifts {
    /*
        Time Complexity : O(N) N is the size of shift array
        Space Complexity : O(1)
    */
    public static String stringShift(String s, int[][] shift) {
		if(s == null || s.length() == 0 || s.length() == 1) return s;

		int countShift = 0, n = s.length();
		boolean isLeftRotate = true;

		for(int i = 0; i < shift.length; i++)
			countShift = shift[i][0] == 0 ? countShift + shift[i][1] : countShift - shift[i][1];

		if(countShift < 0) isLeftRotate = false;
		countShift = Math.abs(countShift) % n;

		if(countShift == 0) return s;

		return isLeftRotate ? leftShift(s, countShift) : leftShift(s, n - countShift);
	}
	
	public static String leftShift(String s, int countShift) {
		return s.substring(countShift) + s.substring(0, countShift);
    }
    
    public static void main(String[] args) {
        System.out.println(stringShift("abcde", new int[][] {{0, 1}, {1, 2}}));
    }
}