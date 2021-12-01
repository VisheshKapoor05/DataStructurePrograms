package DataStructurePrograms.Ordered_LinkedList;

public class OrderedListService {
	
	Node head = null;
	
	public void insertInOrder(int data) {
		
		Node node = new Node();
		
		Node currentNode = head;
		Node previousNode = null;
		
		// if there's no head, insert one
		if(head == null){
			node.setData(data);
			node.setNext(head);
			head = node;
			System.out.println("List started, head: " +head);
		}
		
		// if new node is greater than already existed node:
		else if(currentNode.data < data) 
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
			}
			
			// new node is added at the end if we reach at the end
			else if(currentNode.next == null) {
				node.setNext(null);
				currentNode.next = node;
			}
			
		}
		
		//if new node is greater than/equal to head, means it should be the first node or new head
		else if(currentNode.data >= data) 
		{
			node.setData(data);
			node.setNext(head);
			head = node;
		}
		
		System.out.println("inserted");
	}
	
	
	public void searchNode(int data) {
		Node currentNode  = head;
		
		// iterating till the end
		while(currentNode.next != null)
		{
			// if we get the node with desired data before getting null, we are deleting the node
			if(currentNode.next.data == data) {
				currentNode.setNext(currentNode.next.next);
				System.out.println("The word is found in the list and hence deleted");
				break;
			}
			// if we dont get the data node, means it will be iterated till the end
			else if(currentNode.next.next == null) {
				insertInOrder(data);
				System.out.println("The word is not found in the list and hence added");
				break;
			}
			
			currentNode = currentNode.next;
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
