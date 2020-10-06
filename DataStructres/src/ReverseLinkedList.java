
public class ReverseLinkedList {
	
	static Node head;
	
	static class Node{
		
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	/**Function to reverse the LinkedList**/
	
	Node reverse(Node node) {
		
		Node prev = null;
		Node current = node;
		Node next= null;
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}
	
	//prints the contents of linkedlist
	void printList(Node node) {
		
		while(node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
	
	public static void  main(String [] args) {
		
		ReverseLinkedList lList = new ReverseLinkedList();
		lList.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		Node sixth = new Node(6);
		
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		
		//Printing the linkedlist
		lList.printList(head);
		
		System.out.println();
		
		Node rev  = lList.reverse(head);
		
		//LinkedList after reversal
		lList.printList(rev);
		
		
	}

}
