/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Leer {
    public String leer(String origen) throws IOException {
        File file = new File(origen);
        
        if (!file.exists()) {
            throw new IOException("El archivo no existe: " + origen);
        }

        StringBuilder contenido = new StringBuilder();
        
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                contenido.append(linea).append("\n");  // Agregar cada línea con un salto de línea
            }
        } catch (IOException e) {
            throw new IOException("Error al leer el archivo: " + origen, e);
        }

        return contenido.toString();  // Retornar el contenido completo del archivo
    }
}
