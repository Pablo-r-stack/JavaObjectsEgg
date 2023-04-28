/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Pablo
 */
public class Meses {
    
    private final  String[] meses = {"enero", "febrero" , "marzo", "abril", "mayo", "junio", "julio",
    "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    
    private String mesSecreto;

    public Meses() {
    }
    //el constructor recibe un numero del servicio generado al azar, el mismo asigna un String segun el index del vector meses[]
    public Meses(int numeroMes) {
        this.mesSecreto = meses[numeroMes];
    }
    

    public String[] getMeses() {
        return meses;
    }


    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

   

    @Override
    public String toString() {
        return "Meses{" + "meses=" + meses + ", mesSecreto=" + mesSecreto + '}';
    }


    
}
