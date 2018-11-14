/**
 * This class sets up a node--the basic building block of a
 * linked list.
 * 
 * In this case, the node stores a string record, but nodes can
 * store any combination of data and/or objects.
 * 
 * @author Michael Ida
 *
 */
public class Node {
	
	public Node next;
	public String record;
	
	/*
	 * Constructor
	 */
	public Node(String newRecord) {
		next = null;
		record = newRecord;
	}
}
