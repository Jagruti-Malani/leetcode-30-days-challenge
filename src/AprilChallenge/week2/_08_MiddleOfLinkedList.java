package AprilChallenge.week2;

public class _08_MiddleOfLinkedList {
    /*
        Time Complexity : O(N)
        Space Complexity : O(1)
    */
    public static ListNode middleNode(ListNode head) {
        ListNode fp = head, sp= head;
		
		while(fp.next != null && fp.next.next != null) {
			fp = fp.next.next;
			sp = sp.next;
		}

		return fp.next != null ? sp.next : sp;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        head.next = new ListNode(6);
        head.next.next = new ListNode(7);
        head.next.next.next = new ListNode(8);
        head.next.next.next.next = new ListNode(9);

        System.out.println(middleNode(head).val);
    }

    static class ListNode {
		int val;
		ListNode next;
		ListNode(int data) {
			this.val = data;
        }
        ListNode(int val, ListNode next) { 
            this.val = val; 
            this.next = next; 
        }
		ListNode() {}
	}
}