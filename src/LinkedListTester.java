/**
 * Tester program for LinkedList class
 * 
 * @author Michael Ida
 *
 */
public class LinkedListTester {

	public static void main(String[] args) {
		
		LinkedList testList = new LinkedList();
		Node bookmark;
		
		System.out.println("Testing insertHead()...");
		testList.insertHead("alligator");
		testList.insertHead("buffalo");
		testList.insertHead("crocodile");
		System.out.println("should be crocodile -> buffalo -> alligator");
		System.out.println(testList.toString());
		
		System.out.println("Testing insertTail()...");
		testList.insertTail("dromedary");
		testList.insertTail("elephant");
		System.out.println("should be crocodile -> buffalo -> alligator -> dromedary -> elephant");
		System.out.println(testList.toString());
		
		System.out.println("Testing removeHead()...");
		testList.removeHead();
		System.out.println("should be buffalo -> alligator -> dromedary -> elephant");
		System.out.println(testList.toString());
		
		System.out.println("Testing removeTail()...");
		testList.removeTail();
		System.out.println("should be buffalo -> alligator -> dromedary");
		System.out.println(testList.toString());

		System.out.println("Testing find() and insertAfter()...");
		bookmark = testList.find("alligator");
		testList.insertAfter("fox", bookmark);
		System.out.println("should be buffalo -> alligator -> fox -> dromedary");
		System.out.println(testList.toString());
		
		System.out.println("Testing find() and remove()...");
		bookmark = testList.find("fox");
		testList.remove(bookmark);
		System.out.println("should be buffalo -> alligator -> dromedary");
		System.out.println(testList.toString());
		
		System.out.println("Testing find() without a match...");
		bookmark = testList.find("giraffe");
		if (bookmark == null) {
			System.out.println("correct result");
		} else {
			System.out.println("incorrect result");
		}
	}
}
