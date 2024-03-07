package banco;

public class Cuenta {
	
	private String ccc;
	private String cod_cliente;
	private double saldo;
	
	 public Cuenta() {
	    }
	    public Cuenta(String ccc, String cod_cliente,double saldo){
	        this.ccc=ccc;
	        this.cod_cliente=cod_cliente;
	        this.saldo=saldo;
	    }

	    public String getCcc() {
	        return ccc;
	    }

	    public void setCcc(String ccc) {
	        this.ccc = ccc;
	    }

	    public String getCod_cliente() {
	        return cod_cliente;
	    }

	    public void setCod_cliente(String cod_cliente) {
	        this.cod_cliente = cod_cliente;
	    }

	    public double getSaldo() {
	        return saldo;
	    }

	    public void setSaldo(double saldo) {
	        this.saldo = saldo;
	    }
	    public void ingresar(double cantidad){
	        this.saldo+=cantidad;
	    }
	    public void sacar(double cantidad){
	        this.saldo-=cantidad;
	    }
	    public void verCuenta(){
	        System.out.println("El código de cuenta corriente es " + this.ccc);
	        System.out.println("El código del cliente es " + this.cod_cliente);
	        System.out.println("El saldo disponible es " + this.saldo);
	    }
}
