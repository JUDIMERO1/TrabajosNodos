package estdatos.ordered;

public class OrderedList {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(5, 3);
		r1.calcularArea();
		
		Rectangle r2 = new Rectangle(3, 4);
		r2.calcularArea();
		
		System.out.println(r1.compareTo(r2));
		
		Person p1 = new Person();
		p1.setEdad(35);
		
		Person p2 = new Person();
		p2.setEdad(25);
		
		System.out.println(p1.compareTo(p2));
	}
	
}
