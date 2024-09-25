/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persistencia;
import java.io.IOException;

/**
 *
 * @author cdiaz
 */
public class Persistencia {

     public static void main(String[] args) {
        Leer lector = new Leer();
        String archivoOrigen="/home/cdiaz/NetBeansProjects/Persistencia/src/persistencia/archivo_origen.txt";
        String archivoDestino="/home/cdiaz/NetBeansProjects/Persistencia/src/persistencia/archivo_destino.txt";
        
        try {
            String contenido = lector.leer(archivoOrigen);
            int totalPalabras = lector.contarPalabras(archivoOrigen);
            char caracterBuscado = 'a';  // Cambia este valor al carácter que deseas buscar
            
            int totalCaracteres = lector.contarCaracter(archivoOrigen, caracterBuscado);
            Clonar clonar = new Clonar();
            clonar.clonar(archivoOrigen, archivoDestino);
            String contenidoDestino=lector.leer(archivoDestino);
            
            System.out.println("Contenido del archivo de origen:");
            System.out.println(contenido);
            System.out.println("Total de palabras: " + totalPalabras);
            System.out.println("Apariciones del carácter '" + caracterBuscado + "': " + totalCaracteres);
            
            System.out.println("contenido del archivo de destino ");
            System.out.println(contenidoDestino);
            
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}