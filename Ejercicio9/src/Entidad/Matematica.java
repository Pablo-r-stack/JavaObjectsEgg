/*
 *Ejercicios Prog Orientada a Objetos de la guia Fullstack Egg.
 */
package Entidad;

/**
 *
 * @author Pablo
 */
public class Matematica {
    private double num1;
    private double num2;

    public Matematica() {
    }

    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "Matematica{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
    
    public double devolverMayor(){
        return Math.max(num1, num2);
    }
    //Funcion calcula potencia entre atributos.
    public double calcularPotencia(){
        if (num1 > num2){
            return Math.pow(Math.round(num1), Math.round(num2));
        }else{
            return Math.pow(Math.round(num2), Math.round(num1));
        }
    }
    //Funcion calcula raiz entre atributos.
    public double calcularRaiz(){
        if (num1<num2){
            return Math.sqrt(Math.abs(num1));
        }else{
            return Math.sqrt(Math.abs(num2));
        }
    }
}
