/*
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de 
 * tipo real. A continuación, se deben crear los siguientes métodos: 
 * a) Método constructor que inicialice el radio pasado como parámetro. 
 * b) Métodos get y set para el atributo radio de la clase Circunferencia. 
 * c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del 
 * objeto. 
 * d) Método area(): para calcular el área de la circunferencia (𝐀𝐫𝐞𝐚 = 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨𝟐).
 * e) Método perimetro(): para calcular el perímetro (𝐏𝐞𝐫𝐢𝐦𝐞𝐭𝐫𝐨 = 𝟐 ∗ 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨).
 */
package poogej2;
import entidad.Circunferencia;
/**
 *
 * @author Pablo
 */
public class Poogej2 {

    /**
     * En este ejercicio se optó a modo de practica, escribir los metodos dentro de la Clase
     * Sin recurrir al Servicio. Esto se hizo con el fin de adquirir Experiecia...
     */
    public static void main(String[] args) {
        
        Circunferencia c1 = new Circunferencia(17);
        c1.area();
        
        c1.perimetro();
        
        c1.crearCircunferencia();
        
        c1.area();
        
        c1.perimetro();
        
        Circunferencia c2 = new Circunferencia();
        
        c2.crearCircunferencia();
        
        c2.area();
        
        c2.perimetro();
    }
    
}
