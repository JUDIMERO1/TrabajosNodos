package estdatos.linkedlists;

public class Persona implements Comparable<Persona> {
	private int edad;
	private String nombre;
	private int anioNacimiento;
	
	
	
	public Persona(int edad, String nombre, int anioNacimiento) {
		this.edad = edad;
		this.nombre = nombre;
		this.anioNacimiento = anioNacimiento;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAnioNacimiento() {
		return anioNacimiento;
	}
	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}
	@Override
	public int compareTo(Persona o) {
		
		if(this.getEdad()>o.getEdad())
			return 1;
		else if(this.getEdad()<o.getEdad())
			return -1;
		
		return 0;
	}
	
	
}
