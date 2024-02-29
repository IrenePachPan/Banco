package banco;

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
}
