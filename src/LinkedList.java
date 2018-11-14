/**
 * This class uses nodes to create a linked list.
 * 
 * All of the basic operations that can be performed are defined
 * as methods.
 * 
 * @author Michael Ida
 *
 */
public class LinkedList {
	
	public Node head;
	
	/*
	 * Constructor
	 */
	public LinkedList() {
		head = null;
	}
	
	/*
	 * Create a new node containing newRecord and insert it
	 * at the head of the list.
	 */
	public void insertHead(String newRecord) {
		Node newNode = new Node(newRecord);
		newNode.next = head;
		head = newNode;
	}
	
	/*
	 * Create a new node containing newRecord and insert it at
	 * the tail of the list.
	 */
	public void insertTail(String newRecord) {
		
	}
	
	/*
	 * Create a new node containing newRecord and insert it
	 * after mark.
	 */
	public void insertAfter(String newRecord, Node mark) {
		
	}
	
	/*
	 * Remove the head of the list.
	 */
	public void removeHead() {
		
	}
	
	/*
	 * Remove the last node of the list.
	 */
	public void removeTail() {
		
	}
	
	/*
	 * Remove the mode mark from the list.  Do not break the list
	 */
	public void remove(Node mark) {
		
	}
	
	/*
	 * Traverse the list and find the first node with the record
	 * that matches searchString.  Return a pointer to that node.
	 * If searchString is not found return null.
	 */
	public Node find(String searchString) {
		
	}
	
	/*
	 * Traverse the list and create a printable string listing
	 * all of the elements of the list from head to tail.
	 */
	public String toString() {
		// initialize the printable string
		String returnString = "";
		// create a reference pointer starting at the head
		Node pointer = head;
		// traverse the list
		while (pointer != null) {
			// add the current record to the print string
			returnString += pointer.record + "\n";
			// advance the pointer
			pointer = pointer.next;
		}
		return returnString;
	}
}
