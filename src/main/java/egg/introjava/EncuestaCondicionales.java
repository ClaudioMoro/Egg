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
public class EncuestaCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int opinion;
        Scanner leer = new Scanner(System.in);
        System.out.println("Clasifique la peli de 1 a 5 estrellas");
        opinion = leer.nextInt();
        
        if (opinion >= 1 && opinion <= 5) {
            switch (opinion) {
                case 1:
                case 2:
                    System.out.println("Nos sentimos apenados que no hayas disfrutado la peli...");
                    break;
                case 3:
                    System.out.println("Has calificado la película como buena");
                    break;
                case 4:
                    System.out.println("Has calificado la película como muy buena!");
                   // break;
                case 5:
                    System.out.println("Fantástico que hayas disfrutado de una excelente película!!");
                    break;
            }
        } else if (opinion < 0) {
            System.out.println("¿Una opinión negativa? ¿Taaaaan mala fue la película? :(");
        } else if (opinion == 0) {
            System.out.println("El valor " + opinion + " no es válido y no se tomará en cuenta. :(");
        } else {
            System.out.println(opinion + "! WOW! Se te fue la mano con la calificación! :D");
        }
        
        System.out.println("Hasta la próxima!");
    }
}
