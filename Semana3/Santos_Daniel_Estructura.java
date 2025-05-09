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
import java.util.Random; //Para poder elegir numeros aleatoriamente

public class Santos_Daniel_Estructura {
    public static void MenuPrincipal() { //Para poder mostrar el menu principal despues de terminar cada opcion
        System.out.println("\r                                                                                                                                                                              ");
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
        
        int Contador1 = 0, Contador2 = 0, Contador3 = 0, Contador4 = 0; //Para poder contar cuentas veces se usa cada opcion
        boolean SalirSistema = false; //Para poder hacer un bucle que se repita cada que uno no eliga la opcion de salir del sistema
        
        while(!SalirSistema) {
            MenuPrincipal(); //Llamando al menu 
            int Opcion = scanner.nextInt();
  
            switch(Opcion) {
                case 1: // Parte de Palabras Alreves e Identificacion de Palindromo
                    Contador1++;
                    System.out.print("Cuantas palabras va a ingresar?: ");
                    int CantidadPalabras = scanner.nextInt();
                    
                    while (CantidadPalabras <= 0) {
                        System.out.println("Eso no es permitido, vuelva a ingresar la cantidad de palabras que va a ingresar");
                        CantidadPalabras = scanner.nextInt();
                    }

                    int MaxLongitud = 0;
                    String PalabramasLarga = "";

                    for(int i = 1; i <= CantidadPalabras; i++){
                        System.out.println("Ingrese la palabra #: " + i + " :");
                        String Palabra = scanner.next();

                        String PalabraInversa = "";

                        for (int j = 0; j < Palabra.length(); j++) { //for que dice que lo siguiente se repetira mientras i sea menor o sea igual a la canidad de palabras pedida anteriormente
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
                    Contador2++;
                    System.out.print("Ingrese un numero: ");
                    int Numero = scanner.nextInt();

                    while (Numero <= 0) {
                        System.out.println("Eso no es permitido. Vuelva a ingresar un numero");
                        Numero = scanner.nextInt();
                    }

                    int suma = 0;
                    
                    for (int i = 1; i < Numero; i++) {
                        if (Numero % i == 0) {
                            suma += i;
                        }
                    }
                    
                    if (suma == Numero) {
                        System.out.println("Este numero es perfecto.");
                    } else {
                        System.out.println("Este numero no es perfecto.");
                    }
                    
                    break;

                case 3: // Parte de Numeros Primos
                    Contador3++;
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
                    Contador4++;
                    System.out.print("Cuantos votantes hay?: ");
                    int TotalVotantes = scanner.nextInt();
                    
                    while(TotalVotantes <= 0) {
                        System.out.println("No puede existir menos de un votante, por favor vuelva a ingresar la cantidad de votantes que haya: ");
                        TotalVotantes = scanner.nextInt();
                    }

                    int azul = 0, rojo = 0, negro = 0, amarillo = 0, nulo = 0;

                    for (int l = 1; l <= TotalVotantes; l++) {
                        System.out.println("Ingrese el voto #:" + l + "(Azul, Rojo, Negro, Amarillo): ");
                        String Voto = scanner.next().toLowerCase();

                        switch (Voto) {
                            case "azul":
                                azul++;
                                break;
                            case "rojo":
                                rojo++;
                                break;
                            case "negro":
                                negro++;
                                break;
                            case "amarillo":
                                amarillo++;
                                break;
                            default:
                                nulo++;
                                break;
                        }
                    }

                    int VotosValidos = azul + rojo + negro + amarillo;
                    double PorcentajeVotos = (VotosValidos * 100) / TotalVotantes;

                    System.out.println("**** Resultados de Voto ****");
                    System.out.println("AZUL: " + azul + " votos");
                    System.out.println("ROJO: " + rojo + " votos");
                    System.out.println("NEGRO: " + negro + " votos");
                    System.out.println("AMARILLO: " + amarillo + " votos");
                    System.out.println("NULOS: " + nulo + " votos");

                    if (PorcentajeVotos >= 60) {
                        String Ganador = "";
                        int MayorVotos = Math.max(Math.max(azul, rojo), Math.max(negro, amarillo));
                        int Conteo_ganadores = 0;

                        if (azul == MayorVotos) {
                            Ganador += "AZUL ";
                            Conteo_ganadores++;
                        }
                        if (rojo == MayorVotos) {
                            Ganador += "ROJO ";
                            Conteo_ganadores++;
                        }
                        if (negro == MayorVotos) {
                            Ganador += "NEGRO ";
                            Conteo_ganadores++;
                        }
                        if (amarillo == MayorVotos) {
                            Ganador += "AMARILLO ";
                            Conteo_ganadores++;
                        }

                        if (Conteo_ganadores > 1) {
                            System.out.println("Empate entre: " + Ganador.trim());
                        } else {
                            System.out.println("La plantilla ganadora fue: " + Ganador.trim());
                        }
                    } else {
                        System.out.println("VOTACION FALLIDA");
                    }

                    break;
                
             case 5: // Parte para Salir del Sistema y contador de opciones usadas
                    System.out.println("**** Resumen de Opciones Usadas ****");
                    System.out.println("1. Palabra Alreves e Identificacion de Palindromo: " + Contador1 + " veces");
                    System.out.println("2. Numero Perfecto: " + Contador2 + " veces");
                    System.out.println("3. Numeros Primos: " + Contador3 + " veces");
                    System.out.println("4. Votaciones: " + Contador4 + " veces");
                    System.out.println("\r                                                                                                                                                      ");
                    System.out.println("Saliendo del Sistema, por favor espere un segundo...");
                    SalirSistema = true;
                    break;
                
                default: // Por si se ingresa algo que no es permitido
                    System.out.println("Eso no es permitido, por favor vuelva a ingresar una de las opciones disponibles.");
            }
        }
    }
}
