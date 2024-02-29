package banco;

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

}
