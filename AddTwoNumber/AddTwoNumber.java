
/* https://leetcode.com/problems/add-two-numbers/
*/

public class AddTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = null, l2 = null;
		System.out.println(integrateList(disintegrateList(l1) + disintegrateList(l2)));
	}
	
	public static int disintegrateList(ListNode l1) {
		int sum = 0, temp = 1;
		while(l1 != null) {
			sum += (temp*l1.val);
			temp *= 10;
			l1 = l1.next;
		}
		return sum;
	}
	
	public static ListNode integrateList(int number) {
		ListNode head = null, tail = null;
		int temp = 10;
		while(number != 0) {
			int val = number % temp;
			ListNode iterator = new ListNode(val);
			if(head == null)
				head = iterator;
			else
				tail.next = iterator;
			tail = iterator;
			number /= 10;
		}
		return head;
	}

}
