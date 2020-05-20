package LIST;

public interface listInterface {
	public class Node {
		public int data; 
		public Node next;
		
	
	//to create a new node that contains integer data (calls add() method):
	public Node(int data)
	{
		this.data = data; 
		this.next = null; 
	}
		
	//to manually set 'next' node: 
	public Node(int data, Node next)
	{
		this.data = data; 
		this.next = next; 
	}
}
}
