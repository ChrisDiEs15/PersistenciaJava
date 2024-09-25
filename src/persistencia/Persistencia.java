/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persistencia;

/**
 *
 * @author cdiaz
 */
public class Persistencia {

      public static void main(String[] args) {
        // Definir manualmente los archivos de origen y destino
        String archivoOrigen = "/home/cdiaz/NetBeansProjects/Persistencia/src/persistencia/archivo_origen.txt";
        String archivoDestino = "/home/cdiaz/NetBeansProjects/Persistencia/src/persistencia/archivo_destino.txt";

        // Instanciar la clase Clonar y realizar la clonación
        Clonar clonar = new Clonar();
        clonar.clonar(archivoOrigen, archivoDestino);
    }
    
}
