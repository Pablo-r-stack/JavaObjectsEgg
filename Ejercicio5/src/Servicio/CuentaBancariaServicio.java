/*
 * Clase servicio, como pide el ejercicio comprende las funciones lógicas para el desarrollo del mismo
 * Cuenta con solo dos subprogramas publicos, los demas son private accedidos solo cuando son necesarios.
 * Crea y devuelve un objeto al main
 * Ejecuta una interfaz tipo menu de opciones que llama a != funciones segun entrada.
 */
package Servicio;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class CuentaBancariaServicio {
//importa clase scanner
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
//llamada funcion instancia e inicalizacion de Objeto.
    public CuentaBancaria crearCuenta() {
        CuentaBancaria cb = new CuentaBancaria();
        System.out.println("Ingrese numero de DNI");
        cb.setDni((long) soloNum());
        System.out.println("Ingrese numero de cuenta");
        cb.setNroCuenta((int)soloNum());
        System.out.println("Ingrese saldo Inicial");
        cb.setSaldo(soloNum());
        return cb;
    }
//Subproceso encargado de modificar el setter del atributo saldo del objeto
    private void ingresar(CuentaBancaria cuenta, double ingreso) {
        cuenta.setSaldo(cuenta.getSaldo() + ingreso);
        System.out.println("Dinero ingresado\n saldo actual" + cuenta.getSaldo());
    }
//Subproceso valida que el atributo saldo sea mayor a la cantidad a retirar, de ser así lo ejecuta.
    private void retirar(CuentaBancaria cuenta, double retiro) {
        System.out.println(cuenta.getSaldo() < retiro ? "No puedes retirar esa cantidad, prueba otra vez" : "Retirando dinero");
        cuenta.setSaldo((cuenta.getSaldo() > retiro) ? (cuenta.getSaldo() - retiro) : cuenta.getSaldo());
    }
//Subproceso valida que el monto a retirar no sea mayor a el 20% del atributo saldo del objeto.
    private void extraccionRapida(CuentaBancaria cuenta, double retiro) {
        if (retiro > (cuenta.getSaldo() * 0.20)) {
            System.out.println("No puedes retirar esa cantidad (Extracción rapida máx = 20% de su saldo)");
        } else {
            System.out.println("Retirando efectivo");
            cuenta.setSaldo(cuenta.getSaldo() - retiro);
        }
    }
//Subproceso muestra atributo saldo en su estado actualizado.
    private void consultarSaldo(CuentaBancaria cuenta) {
        System.out.println("Su saldo actual es: " + cuenta.getSaldo());
    }
//Subproceso muestra toString.
    private void consultarDatos(CuentaBancaria cuenta) {
        System.out.println(cuenta);
    }
//Esta función se encarga de que el usuario solo ingrese Numeros a fin de evitar missInput.
    private double soloNum(){
        double monto = 0;
        while(!scan.hasNextDouble()){
            System.out.println("Ingrese un valor válido");
            scan.next();
        }
        monto = scan.nextDouble();
        return monto;
    }
//Subproceso se encarga de mostrar menu de opciones, es el hilo lógico del ejercicio.
    public void menuOpciones(CuentaBancaria cuenta) {
        String opcion = "";
        while (!opcion.equals("6")) {
            System.out.println("Seleccione opción deseada:\n\n1-Ingresar Efectivo.\n2-Retirar Efectivo."
                    + "\n3-Extracción Rápida.\n4-Consultar Saldo.\n5-Consultar Datos de Cuenta.\n6-Salir.");
            opcion = scan.next();
            switch (opcion) {
                case "1":
                    System.out.println("Ingrese saldo a depositar");
                    ingresar(cuenta, soloNum());
                    break;
                case "2":
                    System.out.println("Ingrese saldo a retirar");
                    retirar(cuenta, soloNum());
                    break;
                case "3":
                    System.out.println("Ingrese saldo para extracción rápida");
                    extraccionRapida(cuenta, soloNum());
                    break;
                case "4":
                    consultarSaldo(cuenta);
                    break;
                case "5":
                    consultarDatos(cuenta);
                    break;
                case "6":
                    System.out.println("Sesión finalizada, vuelva pronto.");
                default:
                    System.out.println("Ingrese una opción válida");
            }
        }
    }
}
