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
        
        try {
            String contenido = lector.leer("/home/cdiaz/NetBeansProjects/Persistencia/src/persistencia/archivo_origen.txt");
            int totalPalabras = lector.contarPalabras("/home/cdiaz/NetBeansProjects/Persistencia/src/persistencia/archivo_destino.txt");
            char caracterBuscado = 'a';  // Cambia este valor al carácter que deseas buscar
            int totalCaracteres = lector.contarCaracter("/home/cdiaz/NetBeansProjects/Persistencia/src/persistencia/archivo_origen.txt", caracterBuscado);

            System.out.println("Contenido del archivo:");
            System.out.println(contenido);
            System.out.println("Total de palabras: " + totalPalabras);
            System.out.println("Apariciones del carácter '" + caracterBuscado + "': " + totalCaracteres);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
