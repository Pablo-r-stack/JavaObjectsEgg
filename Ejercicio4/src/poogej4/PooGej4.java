/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
 base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
 con los datos del Rectángulo dados por el usuario. También incluirá un método para
 calcular la superficie del rectángulo y un método para calcular el perímetro del
 rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
 asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
 setters y constructores correspondientes.
 Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package poogej4;
import Entidad.Rectangulo;
import Servicio.RectanguloServicio;
/**
 *
 * @author Pablo
 */
public class PooGej4 {

    /**
     * Se importa e instancia en rs una clase servicio
     * Se importa e instancia en rec un objeto Rectangulo
     *  El mismo se inicializa con lo devuelto por la llamada a funcion rs.crearRectangulo();
     * la clase servicio envia como argumento el objeto inicializado para sus != funciones a ejecutar.
     */
    public static void main(String[] args) {
        RectanguloServicio rs = new RectanguloServicio();
        Rectangulo rec = rs.crearRectangulo();
        rs.perimetro(rec);
        rs.superficie(rec);
        rs.dibujar(rec);
    }
    
}
