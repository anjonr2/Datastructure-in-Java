
public class LinkedList {
	
	//head of the list
	Node head;
	
	//The inner class is made static so that main() can access it
	static class Node{
		int data;
		Node next;
		
		//Constructor
		Node(int d){
			data = d;
			next=null;
		}
		
	}
	
	//method for LinkedList traversal
	
	public void printList()
	{
		Node n= head;
		
		while(n!=null) {
			System.out.print(n.data + " ");
			n=n.next;
		}
	}
	
	//inserting an element in the list at the front
	public void push(int d) {
		Node newNode = new Node(d);
		newNode.next=head;
		head=newNode;
	}
	
	//inserting an element in the list after a given node
	public void insertAfter(Node prev_node, int d) {
		if(prev_node.next==null) {
			System.out.println("Previous node can not be null");
		}
		
		//allocate the node and put the data
		Node newNode = new Node(d);
		
		//Pointing the next of the previous node as the next of the new Node
		newNode.next=prev_node.next;
		
		//making the next of the prev_node as newNode
		prev_node.next=newNode;
	}
	
	public static void main(String[] args) {
		
		LinkedList lList =  new LinkedList();
		
		lList.head=new Node(1);
		Node second=new Node(2);
		Node third= new Node(3);
		
		//Link first node with the second node
		lList.head.next=second;
		
		//Link second node with the third node
		second.next=third;
		
		//inserting an element at the front
		lList.push(4);
			
		//inserting an element after the second node
		lList.insertAfter(second, 5);
		
		//Traversing the singly linked List
		lList.printList();

	}

}
