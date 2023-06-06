package estdatos.doublecircularlinkedlist;

public class ClienteMyDoubleCircularLinkedList {

	public static void main(String[] args) {
		
		MyDoubleCircularLinkedList<String> myD = new MyDoubleCircularLinkedList<String>();
		
		myD.add("Boris");
		myD.add("Rainiero");
		myD.add("Perez");
		myD.printAll(6);
		
		
		
	}
	
	
	
}
