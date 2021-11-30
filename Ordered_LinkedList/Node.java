package DataStructurePrograms.Ordered_LinkedList;

public class Node {
	
	Node next = null;
	int data;
	
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
	public void displayNode() {
		System.out.println(data);
	}
	
	@Override
	public String toString() {
		return "Node [next=" + next + ", data=" + data + "]";
	}
	
}
