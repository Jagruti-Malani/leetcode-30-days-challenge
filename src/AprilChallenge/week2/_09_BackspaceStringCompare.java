package AprilChallenge.week2;

public class _09_BackspaceStringCompare {
    /*
        Time Complexity : O(N)
        Space Complexity : O(1)
    */
    public static boolean backspaceCompare(String S, String T) {
		int i = S.length()-1, j = T.length()-1;
 
    	while(i >= 0 || j >= 0){
        	int bsCount = 0;
        	while(i >= 0 && (bsCount > 0 || S.charAt(i) == '#')){
            	if(S.charAt(i) == '#')
					bsCount++;
            	else
					bsCount--;
				i--;
			}
 
			bsCount = 0;
        	while(j >= 0 && (bsCount > 0 || T.charAt(j) == '#')){
            	if(T.charAt(j) == '#')
					bsCount++;
            	else
					bsCount--;
            	j--;
        	}
	
			if(i >= 0 && j >= 0){
				if(S.charAt(i) == T.charAt(j)){
					i--;  j--; 
				} else {
					return false;
				} 
			} else if(i != j)
				return false;
		}
 
    	return true;
    }

    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab##", "c#d#"));
    }
}