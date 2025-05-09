/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_Programacion1.Semana3;

/**
 *
 * @author Hp
 */

import java.util.Scanner;

public class Santos_Daniel_Estructura {
    public static void MenuPrincipal() {
        System.out.println("---- Menu Principal ----");
        System.out.println("Bienvenido al menu principal, ingrese una de las opciones a hacer");
        System.out.println("1. Palabra Alreves e Identificacion de Palindromo");
        System.out.println("2. Numero Perfecto");
        System.out.println("3. Numeros Primos");
        System.out.println("4. Votaciones");
        System.out.println("5. Salir");
        System.out.println("\r                                                                                                                                                                              ");
        System.out.println("Por favor ingrese que opcion desea hacer (1, 2, 3, 4, 5)");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        MenuPrincipal();
        int Opcion = scanner.nextInt();
        
        switch(Opcion) {
            case 1: // Palabra Alreves e Identificacion de Palindromo
                System.out.println("Ingrese una palabra");
                String Palabra= scanner.next().toLowerCase();
                
                String PalabraInversa = "";

                for(int i = 0; i < Palabra.length(); i++){
                    PalabraInversa = Palabra.charAt(i)+ PalabraInversa;
                }
                
                System.out.println("palabra al revez es: " + PalabraInversa);
                
                if (Palabra.equals(PalabraInversa)) {
                    System.out.println("Su palabra es un polindromo.");
                } else {
                    System.out.println("Su palabra no es un palindromo.");
                }
                break;
                
            case 2: // Numeros Perfectos
                System.out.println("Ingrese un numero: ");
                int Numero = scanner.nextInt();
        
                if (Numero <= 0) {
                    System.out.println("Eso no es permitido. Vuelva a ingresar un numero");
                    Numero = scanner.nextInt();
                }
        
                int suma;
                int i;
                int j;
        
                for (j = 1; j <= Numero; j++) {
                    suma = 0;
                    i = 1;
            
                    while(i < j) {
                        if (j % i == 0) {
                            suma += i;
                        }
                        i++;
                    }
            
                    if (suma == j) {
		        System.out.println(j);
		    }
                }
                break;
                
            case 3:
                
            case 4:
            case 5:
            default:
        }
    }
}
