package estdatos.doublelinkedlists;

public class PC {

	private String nombre;
	private int direccionIP;
	
	public PC(String nombre, int direccionIP) {
		this.nombre = nombre;
		this.direccionIP = direccionIP;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		int cont = 0;
		
		PC pcObj = (PC)obj;
		
		System.out.println("----");
		System.out.print(nombre+":::"+pcObj.getNombre()+":::");
		System.out.print(direccionIP+":::"+pcObj.getDireccionIP());
		
		if(this.nombre.equals(pcObj.getNombre())){
			cont++;
		}
		
		if(this.direccionIP==pcObj.getDireccionIP()) {
			cont++;
		}
				
		if(cont==2)
			return true;
		
		return false;
	}
	
	@Override
	public String toString() {
		
		String nom = "Mi nombre es: "+nombre;
		String ips = "Mi IP es: "+direccionIP;
		
//		return nom + " - " + ips;
		return nombre + ":" + direccionIP;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDireccionIP() {
		return direccionIP;
	}
	public void setDireccionIP(int direccionIP) {
		this.direccionIP = direccionIP;
	}
	
	
	
}
