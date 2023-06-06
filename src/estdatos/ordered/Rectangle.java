package estdatos.ordered;

public class Rectangle implements Comparable<Rectangle> {

	private int base, altura;
	private double area;
	
	public Rectangle(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public int getBase() {
		return base;
	}
	
	public void setBase(int base) {
		this.base = base;
	}
	
	public int getAltura() {
		return altura;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public double getArea() {
		return area;
	}
	
	public void calcularArea() {
		if(base>0 && altura>0)
			area = base * altura / 2;
	}

	/**
	 * Este metodo se encarga de comparar dos objetos para 
	 * permitir su ordenamiento
	 */
	@Override
	public int compareTo(Rectangle o) {
		int res = 0;
		if(area>o.getArea())
			res = 1;
		else if(area<o.getArea())
			res = -1;
		
		return res;
	}
	
}
