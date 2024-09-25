/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Escribir {
    public void escribir(String destino, String texto) throws IOException {
        File file = new File(destino);
        
        // Asegúrate de que el archivo existe, si no, se crea
        if (!file.exists()) {
            file.createNewFile();
        }

        // Usar FileWriter y BufferedWriter para escribir el contenido al archivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(texto);  // Escribir el texto completo
            bw.flush();       // Asegurarse de que todo el texto se haya escrito
        } catch (IOException e) {
            throw new IOException("Error al escribir en el archivo: " + destino, e);
        }
    }
}

