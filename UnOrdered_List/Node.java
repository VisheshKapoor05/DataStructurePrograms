package DataStructurePrograms.UnOrdered_List;

public class Node {
	
	String data;
	Node next = null;
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
	@Override
	public String toString() {
		return "Node [data=" + data + ", node=" + next + "]";
	}
	
	
}
