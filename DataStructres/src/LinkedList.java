
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
	
	//Given a key, delete the first occurrence of the key in linkedlist
	
	void deleteNode(int key) {
		
		//store head node
		Node temp=head, prev=null;
		
		//if the head node itself holds the key to be deleted
		if(temp != null && temp.data == key) {
			
			head = temp.next; //Changed head
			return;
		}
		
		//search for the key to be deleted,keep track of the
		//previous node as we need to change to temp.next
		
		while(temp != null && temp.data != key) {
			prev=temp;
			temp=temp.next;
		}
		
		//if the key is not present in the linkedlist
		
		if(temp==null) return;
		
		//unlinking the node from the lists
		prev.next=temp.next;
	}
	
	public static void main(String[] args) {
		
		LinkedList lList =  new LinkedList();
		
		lList.head=new Node(1);
		Node second=new Node(2);
		Node third= new Node(3);
		Node fourth = new Node(6);
		Node fifth = new Node(7);
		Node sixth = new Node(8);
		
		//Link first node with the second node
		lList.head.next=second;
		
		//Link second node with the third node
		second.next=third;
		
		//Link the third node with the fourth
		third.next=fourth;
		
		//Link the fourth node with the fifth
		fourth.next=fifth;
		
		//Link the fifth node with the sixth
		fifth.next=sixth;
		
		//inserting an element at the front
		lList.push(4);
			
		//inserting an element after the second node
		lList.insertAfter(second, 5);
		
		//Traversing the singly linked List
		lList.printList();
		
		//deleting a key
		lList.deleteNode(6);
		
		System.out.println("Node deleted");
		lList.printList();

	}

}
