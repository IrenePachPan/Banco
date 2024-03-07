package banco;

<<<<<<< HEAD
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
import java.util.Scanner;

public class MainBanco {

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("ES-2345678 ", "A345 ", 200.569);
        Scanner sc = new Scanner(System.in);
        int opcion = 10;
        double importe=0;
        while (opcion != 0) {
            System.out.println("¿Qué operación desea realizar? ");
            System.out.println("1-Crear una cuenta ");
            System.out.println("2-Borrar una cuenta ");
            System.out.println("3-Sacar importe ");
            System.out.println("4- Ingresar importe ");
            System.out.println("5- Consultar cuenta ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 0:
                    System.out.println("Saliendo del sistema ");
                    break;
                case 1:
                    System.out.println("Escribe el número de cuenta ");
                    sc.nextLine();
                    String ccc = sc.nextLine();
                    System.out.println("Escribe el código de cliente ");
                    String cod_cliente = sc.nextLine();
                    System.out.println("Escribe el saldo ");
                    double saldo = sc.nextDouble();
                    sc.nextLine();
                    Cuenta nuevaCuenta=new Cuenta(ccc,cod_cliente,saldo);
                    break;
                case 2:
                    System.out.println("Elimina cuenta ");
                    break;
                case 3:
                    System.out.println("Teclea el importe ");
                    importe=sc.nextDouble();
                    sc.nextLine();
                    cuenta1.sacar(importe);
                    break;
                case 4:
                    System.out.println("Teclea el importe ");
                    importe=sc.nextDouble();
                    sc.nextLine();
                    cuenta1.ingresar(importe);
                    break;
                case 5:
                    cuenta1.verCuenta();
                    break;

                default:
                    System.out.println("Opción incorrecta ");
                    break;
            }
        }
    }
>>>>>>> 5bd0aa9ee36eb6959aa1af69abafc36f63e0ea27
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
