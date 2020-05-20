package LIST;
public class Node implements listInterface {
	
public static class ListMethod{


	public Node add(int item) {
		Node newNode = new Node(item);
		Node curr = headNode; 
		
		//if list is empty:
		if(headNode == null) {
			newNode = new Node(item);
			headNode = newNode;
			
			//you have to return in "if" statements 
			//to get the method to remember last node:
			return newNode; 
		}
		
		//if list is not empty:
		if(headNode != null) {
			newNode = new Node(item);
			while (curr.next != null)
			{
				curr = curr.next; 
			}
			curr.next = newNode; 
			return newNode; 			
		}
		return newNode;		
	}
	
	public Node reverseList(Node curr) {
		
		curr = headNode; 
		Node prev = null; 
		Node nxt = null; 
		
		while (curr != null) { 
			//this needs to be done first so that 
			//the nxt is initialized during the first iteration 
			//and is updated for each other iteration:
			nxt = curr.next; 
			
			//prev is null in first iteration, but is actually 
			//set to the real previous value for every other iteration: 
			curr.next = prev; 
			
			//moves prev forward in order to change pointers in the execution of the previous step
			prev = curr; 
			
			//traverses curr:
			curr = nxt; 	
		}
	//lets the main() know that new head is actually at the end of the list: 
	headNode = prev; 
	
	//give the new 'head' to main():
	return prev; 
	}	
	
	
	
	public Node printList(Node head) {
		Node curr = headNode; 

		while (curr != null)
		{
			System.out.println(curr.data);
			curr = curr.next; 
		}
		System.out.println(" ");
		return curr;
	}
}

public static Node headNode = null;  

public static void main(String[] args){
	ListMethod list = new ListMethod();
	 
	list.add(13); 
	list.add(99);
	list.add(45); 
	list.add(101); 
	list.printList(headNode);
	
	list.reverseList(headNode);
	
	list.printList(headNode);
}
	

}

