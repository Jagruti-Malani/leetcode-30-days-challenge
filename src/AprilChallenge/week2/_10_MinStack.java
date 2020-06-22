package AprilChallenge.week2;
import java.util.*;

public class _10_MinStack {
    Stack<Integer> s;
    Stack<Integer> minS;

    /*
        Space Complexity : O(N) to store stack of min value at ith element of main stack.
        Time Complexity : O(1) to get the min element from stack at any point of time.
    */
    
    public _10_MinStack() {
        this.s = new Stack<>();
        this.minS = new Stack<>();
    }
        
    public void push(int x) {
        this.s.push(x);
    
        if(this.minS.empty())
            this.minS.push(x);
        else
            this.minS.push(Math.min(x, this.minS.peek()));
    }
        
    public void pop() {
        if(!this.s.isEmpty()) {
            this.s.pop();
            this.minS.pop();
        }
    }
        
    public int top() {
        return this.s.peek();
    }
        
    public int getMin() {
        return this.minS.peek();
    }    

    public static void main(String[] args) {
        _10_MinStack obj = new _10_MinStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        System.out.print(obj.getMin());
        obj.pop();
        System.out.print(" " + obj.top());
        System.out.print(" " + obj.getMin());
    }
}