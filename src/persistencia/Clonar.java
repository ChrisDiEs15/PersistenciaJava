/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.IOException;

public class Clonar {
    private Leer leer = new Leer();
    private Escribir escribir = new Escribir();

    public void clonar(String origen, String destino) {
        try {
            // Leer el contenido del archivo de origen
            String contenido = leer.leer(origen);
            
            // Asegurarse de que el contenido no esté vacío
            if (contenido.isEmpty()) {
                System.out.println("El archivo de origen está vacío o no pudo leerse.");
                return;
            }
            
            // Escribir el contenido en el archivo de destino
            escribir.escribir(destino, contenido);
            
            System.out.println("Archivo clonado exitosamente.");
        } catch (IOException e) {
            System.err.println("Error durante la clonación: " + e.getMessage());
            e.printStackTrace();
        }
    }
}