package estdatos.circularlinkedlist;

public class ClienteMyCircularLinkedList {

	public static void main(String[] args) {
		
		MyCircularLinkedList<Integer> myD = new MyCircularLinkedList<Integer>();
		
		myD.add(5);
		myD.add(9);
		myD.add(7);
		
		myD.print(5);
		
		myD.remove(7);
		
		myD.print(5);
                myD.updateNode(4, 9);
		myD.print(5);
                myD.addAfter(4, 100);
                myD .print(6);
                
	}
	
	
	
}
