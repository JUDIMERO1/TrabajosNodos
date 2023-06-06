package estdatos.doublelinkedlists;

public class MyDoubleLinkedList<E> {

	private Node<E> head;
	private int size = 0; // Number of elements in the list
	
	/**
	 * Agregar un nodo con el elemento correspondiente al final 
	 * de la lista o inicio de la lista
	 * @param element
	 */
	public void add(E element) {
		
		if(head==null) {
			// Si la lista está vacía, la cabeza será el nodo que se creará
			head = new Node<E>(element); 
			size++;
			// Se incluye return para que finalice el método
			return; 
		}
		
		// Variable temporal apuntando a la cabeza
		Node<E> current = head;
		
		// Recorro la lista moviendo el apuntador
		while(current.getNext()!=null) {
			current = current.getNext();
		}
		
		// Cuando se encuentra el último nodo, es decir, 
		// el nodo sin un nodo siguiente, entonces 
		// se crea el nuevo nodo asignándolo como current
		
		Node<E> newNode = new Node<E>(element);
		current.setNext(newNode);
		newNode.setPrev(current);
		
		size++;
		
		// Buscar nodo con el data elementBefore
		
		// Conecto
		
	}
	
	/**
	 * Busca un elemento dentro de una lista, y lo elimina.
	 */
	public void remove(E element) {
		// TODO Considerar los posibles casos
		// 1) Si el elemento a borrar está en la cabeza
		// 2) Si el elemento a borrar está en la mitad
		// 3) Si el elemento a borrar está en la cola
		
		
		// ---------------------------
		// Se considera el caso (2)
		// ---------------------------
		
		// Se pregunta si hay un elemento luego de la cabeza
		if(head.getNext()!=null) {
		
			Node<E> previous = head;
			
			while(previous.getNext()!=null) {
					
				Node<E> toFind = previous.getNext();
				
				if(!element.equals(toFind.getData())){
					previous = toFind;
				}else {
					Node<E> current = toFind.getNext();
					previous.setNext(current);
					current.setPrev(previous);
					size--;
					return;
					// ¿Qué pasa con la relación que queda del 
					// nodo a eliminar y el nodo que le sigue? 
				}
								
			}
		
		}	
		
		// ---------------------------
		// Se considera el caso (1)
		// ---------------------------
		
		
		// ---------------------------
		// Se considera el caso (3)
		// ---------------------------
		
	}
	
	/**
	 * Este método busca un nodo que contenga el valor elementToFind
	 * y agrega un nodo antes, con el valor elementToAdd.
	 * @param elementToFind Elemento a encontrar para agregar un nodo antes.
	 * @param elementToAdd Valor del nodo a insertar.
	 */
	public void addBefore(E elementToFind, E elementToAdd) {
		
	}
	
	/**
	 * Este método busca un nodo que contenga el valor elementToFind
	 * y agrega un nodo después, con el valor elementToAdd.
	 * @param elementToFind Elemento a encontrar para agregar un nodo después.
	 * @param elementToAdd Valor del nodo a insertar.
	 */
	public void addAfter(E elementToFind, E elementToAdd) {
		
	}
	
	/**
	 * Este método busca un nodo que contenga el valor elementToFind
	 * y elimina el nodo siguiente.
	 * @param elementToFind Elemento a encontrar para eliminar el nodo siguiente.
	 */
	public E removeAfter(E elementToFind) {
		return null;
	}
	
	/**
	 * Este método busca un nodo que contenga el valor elementToFind
	 * y elimina el nodo anterior.
	 * @param elementToFind Elemento a encontrar para eliminar el nodo anterior.
	 */
	public E removeBefore(E elementToFind) {
		return null;
	}
	
	/**
	 * Actualize el valor de un nodo. Busca el nodo con el valor oldElement, 
	 * y lo reemplaza con el valor newElement. Es importante aclarar que este
	 * método no crea un nodo, sino que reemplaza el valor del nodo encontrado.
	 * @param newElement
	 * @param oldElement
	 */
	public void updateNode(E newElement, E oldElement) {
		
	}
	
	/**
	 * Busca dentro de la lista en busca del elemento pasado
	 * por parámetro
	 * @param element Elemento a buscar en la lista
	 * @return True/False dependiendo de si lo encuentra
	 */
	public boolean find(E element) {
		
		Node<E> current = head;
		
		do {
			E ele = current.getData();
			
			if(ele.equals(element)) {
				return true;
			}else {
				current = current.getNext();
			}
				
		}while(current!=null);
		
		
		return false;
	}
	
	/**
	 * Imprime la lista en el sentido inverso, iniciando
	 * por la cabeza.
	 */
	public void printReverse() {
		
	}
	
	public void print() {
		
		// Imprime el tipo de dato del nodo luego de la 
		// instanciación genérica.
//		System.out.println(head.getData().getClass().getTypeName()) ;
		
//		StringBuffer sb = new StringBuffer("[");
		
		Node<E> current = head;
		for(int i=0;i<size;i++) {
			System.out.println(current.getData());
			
			
			current = current.getNext();
//			if(current != null)
//				sb.append(", ");
//			else
//				sb.append("]");
		}
		
//		System.out.println(sb.toString());
		
		
		
	}
}
