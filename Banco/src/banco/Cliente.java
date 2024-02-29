package banco;

import java.util.Scanner;

public class Cliente {
	//Atributos
	private String cod_cliente;
	private String nombre;
	private int edad;
	//Constructor por defecto
	public Cliente(){
		
	}
	/*public Cliente(String cod_cliente, String nombre, int newAttr){
		this.cod_cliente=cod_cliente;
		this.nombre=nombre;
		this.newAttr=newAttr;
	}*/
	//Metodos
	public void crearCliente(){
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce tu cod_cliente(string):");
		 this.cod_cliente =sc.next();
		
		System.out.println("Introduce tu nombre(String):");
		 this.nombre=sc.next();
		
		System.out.println("Introduce tu edad(Int):");
		 this.edad=sc.nextInt();
		sc.close();
		
		/*this.cod_cliente=cod_cliente;
		this.nombre= nombre;
		this.newAttr= newAttr;*/
	}
	public void verCliente(){
		System.out.println("Codigo: "+this.cod_cliente);
		System.out.println("Nombre:" +this.nombre);
		System.out.println("Edad: "+this.edad);
	}
}

