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
import java.util.Random;

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
            case 1: // Parte de Palabras Alreves e Identificacion de Palindromo
                System.out.print("Cuantas palabras va a ingresar?: ");
                int CantidadPalabras = scanner.nextInt();
                
                int MaxLongitud = 0;
                String PalabramasLarga = "";

                for(int i = 1; i <= CantidadPalabras; i++){
                    System.out.println("Ingrese la palabra #: " + i + " :");
                    String Palabra = scanner.next();
                
                    String PalabraInversa = "";
                    
                    for (int j = 0; j < Palabra.length(); j++) {
                        PalabraInversa = Palabra.charAt(j) + PalabraInversa;
                    }
                    
                    System.out.println("Palabra invertida: " + PalabraInversa);
                    
                    if (PalabraInversa.equals(Palabra)) { //Revisa si es palindromo o no
                        System.out.println("Esta palabra es un palindromo.");
                    } else {
                        System.out.println("Esta palabra no es un palindromo.");
                    }
                    
                    if (Palabra.length() > MaxLongitud) { //Revisa si la longitud de la palabra es mayor a la longitud maxima actual y la reemplaza si lo es
                        MaxLongitud = Palabra.length();
                        PalabramasLarga = Palabra;
                    } else if (Palabra.length() == MaxLongitud) {
                        PalabramasLarga += " ," + Palabra; //Si haya una con la misma longitud que la maxima actual, la añade con una coma 
                    }
                }
                
                System.out.println("Palabra(s) mas larga(s): " + PalabramasLarga + " con " + MaxLongitud + " letras");
                break;
                
            case 2: // Parte de Numeros Perfectos
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
                
            case 3: // Parte de Numeros Primos
                Random random = new Random(); //importando una clase llamada Random para generar numeros de manera aleatoria
                
                int Random = random.nextInt(100) + 1; //Variable que elige un numero aleatorio y se limita al 100, se le pone + 1 para que empieze por el uno
                int Divisores = 0;
                
                for (int k = 1; k <= Random; k++) {
                    if (Random % k == 0) {
                        System.out.println(k + " ");
                        Divisores++;
                    }
                }
                
                if (Divisores == 2) {
                    System.out.println("El numero random fue: " + Random + "\nEste numero es Primo.");
                } else {
                    System.out.println("El numero random fue: " + Random + "\nEste numero no es Primo.");
                }
                break;
            case 4: // Parte de Votaciones 
                System.out.print("Cuantos votantes hay?: ");
                int TotalVotantes = scanner.nextInt();
                
                int azul = 0, rojo = 0, negro = 0, amarillo = 0, nulo = 0;
                
                for (int l = 0; l < TotalVotantes; l++) {
                    System.out.println("Ingrese el voto #:" + l + "(Azul, Rojo, Negro, Amarillo): ");
                    String Voto = scanner.next().toUpperCase();
                    
                    if (Voto.equals("azul")) {
                        azul++;
                    } else if (Voto.equals("rojo")) {
                        rojo++;
                    } else if (Voto.equals("negro")) {
                        negro++;
                    } else if (Voto.equals("amarillo")) {
                        amarillo++;
                    } else {
                        nulo++;
                    }
                }
                
                int VotosValidos = azul + rojo + negro + amarillo;
                double PorcentajeVotos = (VotosValidos * 100) / TotalVotantes;
                
                System.out.println("**** Resultados de Voto ****");
                System.out.println("Azul: " + azul + " votos");
                System.out.println("Rojo: " + rojo + " votos");
                System.out.println("Negro: " + negro + " votos");
                System.out.println("Amarillos: " + amarillo + " votos");
                System.out.println("Nulos: " + nulo + " votos");
                
                break;
                
            case 5: // Parte para Salir del Sistema
                System.out.println("Saliendo del Sistema, por favor espere un segundo...");
                break;
                
            default: // Por si se ingresa algo que no es permitido
                System.out.println("Eso no es permitido, por favor vuelva a ingresar una de las opciones disponibles.");
                return;
        }
    }
}
