/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_Programacion1.Semana4;

/**
 *
 * @author Hp
 */

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        
        System.out.println("Ingrese una palabra o frase: ");
        String Frase = scanner.next();
        
        String FraseInvertida = " ";
        
        for (int i = 0; i < Frase.length(); i++) {
            FraseInvertida = Frase.charAt(i) + FraseInvertida;
        }
        System.out.println("Frase invertida: " + FraseInvertida);
    }
}
