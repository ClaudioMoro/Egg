/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.introjava;

import java.util.Scanner;

/**
 *
 * @author cmoro1
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se crea una variable Scanner que se utiliza para leer datos del usuario
        Scanner leer = new Scanner(System.in);
        // Se crea una variable cadena (String)que se utiliza para leer datos del usuario
        String nombre;
        // Muestra un mensaje por pantalla
        System.out.println("Ingresa tu nombre:");
        // Leemos el nombre de la persona en la variable nombre
        nombre = leer.next();
        // Mostramos por consola un saludo personalizado
        System.out.println("Hola Mundo! Soy " + nombre + " y estoy programando en Java!");
    }
    
}
