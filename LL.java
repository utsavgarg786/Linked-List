package LinkedList;

public class LL {
		static Node head;
		public static void main(String[] args) {
			LL list = new LL();
			list.addFirst("a");
			list.addFirst("is");
			list.addLast("relation");
			list.print();
			//list.deleteFirst();
			list.print();
			//list.deleteLast();
			list.print();
			int size = sizeOfLinkedList();
			System.out.println(size);
			
			System.out.println("After Position 2");
			int position =2;
			list.addInMiddle("-" , size, position);
			list.print();
			
			System.out.println("Reverse LinkedList");
			Node ans = reverseLinkedList(head);
			//System.out.println(ans.data);
			list.print(ans);
		}
		
		private void print(Node head) {

			if(head == null) {
				System.out.println("List is Empty");
			}
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println("Null");
		}

		private void addFirst(String data) {

			Node newNode = new Node(data);
			if(head == null) {
				head = newNode;
				return;
			}
			newNode.next = head;
			head = newNode;
		}
		
		private void addLast(String data) {

			Node newNode = new Node(data);
			newNode.next = null;
			if(head == null) {
				head = newNode;
				return;
			}
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		
		private void print() {

			if(head == null) {
				System.out.println("List is Empty");
			}
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println("Null");
		}
		
		private void deleteFirst() {

			if(head == null) {
				System.out.println("List is Empty");
				return;
			}
			head = head.next;
		}
		
		private void deleteLast() {

			Node previousNode = head;
			if(head == null) {
				System.out.println("List is Empty");
				return;
			}
			Node temp = head;
			while(temp.next != null) {
				previousNode = temp;
				temp = temp.next;
			}
			previousNode.next = null;
		}
		
		private static int sizeOfLinkedList() {

			int count = 0;
			Node temp = head;
			while(temp != null) {
				count++;
				temp = temp.next;
			}
			return count;
		}
		
		private void addInMiddle(String data, int size, int position) {

			int i =1;
			Node newNode = new Node(data);
			if(head == null) {
				System.out.println("List is Empty");
			}
			if(position > size) {
				System.out.println("Invalid Position");
			}
			Node temp = head;
			while(i<position) {
				temp = temp.next;
				i++;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
		
		private static Node reverseLinkedList(Node head) {

			Node previousNode = null;
			Node currentNode, nextNode;
			currentNode = nextNode = head;
			while(nextNode != null) {
				nextNode = nextNode.next;
				currentNode.next = previousNode;
				previousNode = currentNode;
				currentNode = nextNode;
			}
			head = previousNode;
			return previousNode;
		}
}
