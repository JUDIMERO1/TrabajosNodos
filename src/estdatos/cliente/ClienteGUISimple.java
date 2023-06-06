package estdatos.cliente;

import javax.swing.JOptionPane;

public class ClienteGUISimple {

	public static void main(String[] args) {
	
		ClienteGUISimple cliente = new ClienteGUISimple();
		
		int op = 0;
		
		do {
			
			String opS = JOptionPane.showInputDialog("Ingrese la opción:\n1. Ingresar datos contacto\n2. Buscar empleado\n0. Salir");
			op = Integer.parseInt(opS);
			
			if(op==1)
				cliente.accion1();
			else if(op==2)
				cliente.accion2();
			else if(op==0)
				JOptionPane.showMessageDialog(null, "Vuelva pronto :)");
			
		}while(op!=0);
		
	}
	
	public void accion1() {
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
		String telefono = JOptionPane.showInputDialog("Ingrese el teléfono: ");
		String ubicacion = JOptionPane.showInputDialog("Ingrese la ubicación (N: Nacional / I: Internacional): ");
	}
	
	public void accion2() {
		
	}
}
