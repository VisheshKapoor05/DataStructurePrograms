package DataStructurePrograms.Ordered_LinkedList;

public class OrderedListService {
	
	Node head;
	
	public void insertInOrder(int data) {
		
		Node node = new Node();
		System.out.println("inserting...");
		// if there's no head, insert one
		if(head == null){
			node.setData(data);
			node.setNext(head);
			head = node;
			System.out.println("List started, head: " +head);
		}
		
		Node currentNode = head;
		Node previousNode = null;
		// if new node is greater than already existed node:
		if(currentNode.data < data) 
		{
			
			//iterating till it gets greater than or equal to a specific node or reaches the end
			while(currentNode.data < data
					&& currentNode.next != null) {
				previousNode = currentNode;
				currentNode = currentNode.next;
			}
			node.setData(data);
			
			// if we reach a node greater than/equal to a node, new node will reference to that node
			if(currentNode.data >= data) {
				node.setNext(currentNode);
				previousNode.next = node;
				System.out.println("number added in between " +node.data);
			}
			else if(currentNode.next == null) {
				node.setNext(null);
				currentNode.next = node;
				System.out.println("number added at the end "+node.data);
			}
			
		}
		
		//if new node is greater than/equal to head, means it should be the first node or new head
		else if(currentNode.data >= data) 
		{
			node.setData(data);
			node.setNext(head);
			head = node;
			System.out.println("Node added at starting " +head.data);
		}
		
	}
	
	public void displayList() {
		Node currentNode = head;
		
		while(currentNode != null) {
			currentNode.displayNode();
			currentNode = currentNode.next;
		}
	}
	
}
