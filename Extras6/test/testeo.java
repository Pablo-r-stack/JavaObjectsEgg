
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class testeo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese palabra");//Se pide palabra por teclado
        String palabra = scan.next();

        String[] ahorcado = new String[palabra.length()];//se dimensiona el vector con el tamaño de palabra
        
        for (int i = 0; i < palabra.length(); i++) {//inicializa el vector con guiones
            ahorcado[i] = "-";
        }

        for (String let : ahorcado) {//bucle de impresion de vector vacio
            System.out.print(let + " ");
        }
        
        int contador = 10;//contador de validacion
        do{
        System.out.println("Ingrese una Letra :");
        String letra = scan.next();//se lee letra

        if (palabra.contains(letra)) {//el if valida si en la palabra a adivinar se encuentra la letra
            llenar(ahorcado, letra, palabra);//si es true se llama a la funcion llenar que llena las posiciones correctas
        } else {//false ejecuta mensaje y descuenta el contador
            System.out.println("No se encontro la palabra! un intento menos");
            contador--;
        }
        
        for (String let : ahorcado) {//se imprime el vector en el estado actual
            System.out.print(let + " ");
        }
        
        if(gano(ahorcado, palabra) == true){//valida en cada vuelta si el vector es igual a la palabra a adivinar
            break;
        }
        }while(contador>0);
        
        if(contador <=10 && contador >0){//segun la salida del bucle valida el valor del contador, si alcanzo 10 perdio.
            System.out.println("Felicidades ganaste esta vez!!");
        }else{
            System.out.println("JAJAJA PERDISTE!!");
        }
        System.out.println("Termino el juego!");
    }

    public static void llenar(String[] a, String b, String palabra) {
    //este procedimiento se ejecuta si se encontro la letra en la palabra a adivinar
        for (int i = 0; i < palabra.length(); i++) {//el bucle itera buscando coincidencias de la letra en el substring de la palabra
            if (palabra.substring(i, i + 1).equalsIgnoreCase(b)) {
                a[i] = b;//si encuentra la coincidencia en la palabra, sobreescribe la posicion correspondiente en el vector
            }
        }
    }
    
    public static boolean gano(String[] a, String palabra){
        //esta funcion devuelve true false segun si el vector transformado a cadena coincide con la palabra a adivinar
        
        if(String.join("", a).matches(palabra)){
          return true;  
        }else{
            return false;
        }
    }
}
