/*
 * Se declaran 3 atributos privados
 * Se crea constructor de clase, setter&getter y metodo toString.
 */
package Entidad;

/**
 *
 * @author Pablo
 */
public class CuentaBancaria {
    private long dni;
    private int nroCuenta;
    private double saldo;

    public CuentaBancaria() {
    }

    public CuentaBancaria(long dni, int nroCuenta, double saldo) {
        this.dni = dni;
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Datos de la cuenta{" + "Dni: " + dni + ", nroCuenta: " + nroCuenta + ", saldo: $" + saldo + '}';
    }
    
}
