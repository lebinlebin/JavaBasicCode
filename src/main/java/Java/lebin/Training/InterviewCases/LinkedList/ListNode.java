package Java.lebin.Training.InterviewCases.LinkedList;

public class ListNode {
	 int val;
	 ListNode next;
	 ListNode(int x) { val = x; }
	 @Override
	public String toString() {
		return val + " -> " + next;
	}
}
