package DataStructurePrograms.UnOrdered_List;

public class UnOrderedListServices {
	
	Node head;
	
	
	// inserting a new node
	public void insertNode(String data) {
		Node node = new Node();
		node.setData(data);
		node.setNext(head);
		head = node;
	}
	
	
	public void searchNode(String data) {
		Node currentNode = head;
		
		//iterating till the last node
		while(currentNode.next != null) {
		
			// if we get the node with desired data before getting null, we are deleting the node
			if(currentNode.next.data.compareTo(data)==0) {
				currentNode.setNext(currentNode.next.next);
				System.out.println("The word is found in the list and hence deleted");
				break;
			}
		
			// if we dont get the data node, means it will be iterated till the end
			else if(currentNode.next.next == null) {
				insertNode(data);
				System.out.println("The word is not found in the list and hence added");
				break;
			}
			
			currentNode = currentNode.next;
		}
		
		System.out.println();
		displayList();
		
	}
	
	
	public void displayList() {
		Node currentNode = head;
		
		while(currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}
}
