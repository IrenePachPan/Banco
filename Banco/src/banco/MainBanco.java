package banco;

<<<<<<< HEAD
public class MainBanco {
	
	/*private int valor;
	
	public MainBanco() {
		
	}
	
	System.out.println("1.Gestionar cuenta:");
	System.out.println("2.Gestionar cliente:");
	System.out.println("3.Gestionar empleado:");*/
	

	public static void main(String[] args) {
		//Menu
		//MainBanco menu= new MainBanco;
		
		//Pruebas clase cliente
		Cliente cliente= new Cliente();
		
		cliente.crearCliente();
		cliente.verCliente();
		
		
	}

=======
import java.util.*;

public class MainBanco {
	private static int opcionElegida=0;
	public MainBanco() {
	}
	public void elegirOpcion() {
		Empleado empleado = new Empleado();
		Cliente cliente = new Cliente();
		Cuenta cuenta = new Cuenta();
		Scanner s = new Scanner(System.in);
		opcionElegida = s.nextInt();
		s.close();
		switch(opcionElegida) {
		case 1: 
			cliente.crearCliente();
			break;
		case 2: 
			cliente.verCliente();
		case 3:
			cuenta.ingresar();
		case 4: 
			cuenta.sacar();
		case 5:
			cuenta.verCuenta();
		case 6:
			empleado.crearEmpleado();
		case 7: 
			empleado.verEmpleado();
		}
	}
	public static void main (String[] Args){
		MainBanco banco = new MainBanco();
		do {
			System.out.println("Escoge una opción (número)");
			System.out.println("1. Crear cliente");
			System.out.println("2. Ver cliente");
			System.out.println("3. Ingresar dinero");
			System.out.println("4. Sacar dinero");
			System.out.println("5. Ver cuenta");
			System.out.println("6. Crear empleado");
			System.out.println("7. Ver empleado");
			banco.elegirOpcion();
		}while(opcionElegida==0);
	}
>>>>>>> 0d73c58ea95df78168215491f262e3c078470685
}
