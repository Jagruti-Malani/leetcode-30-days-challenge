package AprilChallenge.week1;
import java.util.*;

public class _06_GroupAnagrams {

    /*
        Time Complexity : O(N*N*M) [n is length of strs & m is minimum of length of s and t]
        Space Complexity : O(N) [Space required to store result is not counted]
    */
    public static List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return null;
        
		List<List<String>> result = new ArrayList<>();
        int i;
		
        for(String s : strs) {
			for(i= 0; i < result.size(); i++) {
                List<String> tList= result.get(i);
				String t = tList.get(0);

				if(s.length() == t.length())
					if(areAnagram(s, t)) {
						tList.add(s);  break;	
					}
			}

			if(i == result.size())
				result.add(new ArrayList<>(Arrays.asList(s)));	
		}
		
		return result;
    }
                           
    public static boolean areAnagram(String s, String t) {
		int NO_OF_CHARS = 256;
		int count[] = new int[NO_OF_CHARS]; 
		Arrays.fill(count, 0);

		for(int i=0; i<s.length() && i<t.length(); i++) {
			count[s.charAt(i)]++;
			count[t.charAt(i)]--;
		}

		for (int i = 0; i < NO_OF_CHARS; i++)
			if (count[i] != 0) 
				return false; 
	
		return true; 
	}

	public static void main(String[] args) {
		String[] inputs = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(groupAnagrams(inputs));
    }
}