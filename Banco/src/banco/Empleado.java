package banco;

import java.util.*;

public class Empleado {
	private String cod_empleado;
	private String nombre;
	
	public Empleado() {
		
	}
	
	public void crearEmpleado(){
		Scanner s = new Scanner(System.in);
		System.out.println("introduce un código de empleado:");
		this.cod_empleado = s.next();
		System.out.println("introduce un nombre");
		this.nombre = s.next();
		s.close();
	}
	
	public void verEmpleado(){
		 System.out.println("codigo_empleado" + this.cod_empleado);
		 System.out.println("");
		 System.out.println("nombre" + this.nombre);
	}
}
