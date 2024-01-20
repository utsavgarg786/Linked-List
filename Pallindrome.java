package LinkedList;

import java.util.Stack;

public class Pallindrome {

	public static void main(String[] args) {

		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		//ListNode three = new ListNode(3);
		ListNode four = new ListNode(2);
		ListNode five = new ListNode(1);
		one.next = two;
		two.next = four;
		//three.next = four;
		four.next = five;
		boolean result = isPallindrome(one);
		System.out.println(result);
		
		boolean result1 = isPallindrome1(one);
		System.out.println(result1);
	}

	private static boolean isPallindrome1(ListNode head) {

		if(head == null || head.next == null) {
			return false;
		}
		Stack<Integer> stack = new Stack<>();
		ListNode slow, fast;
		slow = fast = head;
		while(fast != null && fast.next != null) {
			stack.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}
		if(fast != null && fast.next == null) {
			slow = slow.next;
		}
		while(slow != null) {
			if(slow.data != stack.pop()) {
				return false;
			}
			slow = slow.next;
		}
		return true;
	}

	
	
	
	
	
	
	
	//1st way
	private static boolean isPallindrome(ListNode head) {

		boolean isPallin = false;
		if(head == null || head.next == null) {
			isPallin = true;
		}
		Stack<Integer> stack = new Stack<>();
		ListNode current = head;
		ListNode temp = head;
		while(current != null) {
			stack.push(current.data);
			current = current.next;
		}
		
		while(temp != null) {
			int i  = stack.pop();
			if(temp.data == i) {
				isPallin = true;
			}
			else {
				isPallin = false;
				break;
			}
			temp = temp.next;
		}
		
		return isPallin;
	}
	
}
