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

    public int contarPalabras(String origen) throws IOException {
        File file = new File(origen);

        if (!file.exists()) {
            throw new IOException("El archivo no existe: " + origen);
        }

        int contadorPalabras = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linea;
            int contadorEspacios = 0;

            while ((linea = br.readLine()) != null) {
                // Contar espacios en la línea
                for (char c : linea.toCharArray()) {
                    if (c == ' ') {
                        contadorEspacios++;
                    }
                }

                // Dividir la línea en palabras y contar
                String[] palabras = linea.trim().split("\\s+");
                contadorPalabras += palabras.length;
            }

            System.out.println("Número de palabras: " + contadorPalabras);
            System.out.println("Número de espacios: " + contadorEspacios);
        } catch (IOException e) {
            throw new IOException("Error al leer el archivo: " + origen, e);
        }

        return contadorPalabras;  // Retornar el conteo total de palabras
    }

    public int contarCaracter(String origen, char caracter) throws IOException {
        File file = new File(origen);

        if (!file.exists()) {
            throw new IOException("El archivo no existe: " + origen);
        }

        int contadorCaracter = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                for (char c : linea.toCharArray()) {
                    if (c == caracter) {
                        contadorCaracter++;  // Incrementar contador si el carácter coincide
                    }
                }
            }
        } catch (IOException e) {
            throw new IOException("Error al leer el archivo: " + origen, e);
        }

        return contadorCaracter;  // Retornar el conteo total del carácter
    }
}
