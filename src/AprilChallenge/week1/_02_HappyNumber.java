package AprilChallenge.week1;
import java.util.*;

public class _02_HappyNumber {
    /*
        Time Complexity : O(N) where n is the number of repitition. The funtion getSumOfSquare() takes log10(N) complexity for current N.
        Space Complexity : O(N) where n is the number of repition and in each repition to store the value
    */
    public static boolean isHappy(int n) {
        var visited = new HashSet<Integer>();
        
        while(true) {
            if(!visited.contains(n))
                visited.add(n);
            else
                return false;
            
            int sum = getSumOfSquare(n);
            
            if(sum == 1) return true;
            n = sum;
        }
        
    }
    
    public static int getSumOfSquare(int n) {
        int sum = 0;
        
        while(n > 0) {
            int digit = n%10;
            n /= 10;
            sum += digit * digit;
        }
        
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}