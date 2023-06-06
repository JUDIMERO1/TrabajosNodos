package estdatos.ordered;

public class Person implements Comparable<Person> {

	private String name;
	private int cc, edad;
		
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Compara las edades de dos personas para establecer
	 * quien es mayor.
	 * @return 1 si la edad del 1er objeto es mayor a la del parámetro
	 * 		-1 si la edad del 1er objeto es menor a la del parámetro.
	 * 		0 si son iguales
	 */
	@Override
	public int compareTo(Person o) {
		
		int res = 0;
		if(edad<o.getEdad())
			res = -1;
		else if(edad>o.getEdad())
			res = 1;
			
		return res;
	}

}
