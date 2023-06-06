package estdatos.doublelinkedlists;

public class ClienteMyDoubleLinkedList {

	public static void main(String[] args) {
		
		MyDoubleLinkedList<PC> myD = new MyDoubleLinkedList<PC>();
		
		PC pc1 = new PC("Alfa", 88234);
		PC pc2 = new PC("Beta", 12985);
		PC pc4 = new PC("Gamma", 98462);

		myD.add(pc1);
		myD.add(pc2);
		myD.add(pc4);
		
		myD.print();
		
		PC pc3 = new PC("Beta", 12985);
		System.out.println(myD.find(pc3));
		
		
//		MyDoubleLinkedList<String> myD1 = new MyDoubleLinkedList<String>();
//		
//		myD1.add("Boris");
//		myD1.add("Perez");
//		myD1.print();
//		
//		
//		MyDoubleLinkedList<Integer> myI = new MyDoubleLinkedList<Integer>();
//		
//		myI.add(5);
//		myI.add(7);
//		myI.print();
		
	}
	
	
	
}
