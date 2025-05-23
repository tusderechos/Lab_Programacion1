/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_Programacion1.Semana5_Examen;

/**
 *
 * @author Hp
 */

import java.util.Scanner;
import java.util.Random;

public class Santos_Daniel_Exam1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        scanner.useDelimiter("\n");
        
        int Opcion = 0;
        String FraseCifrada = "";
        String FraseDescifrada = "";
        
        do {            
            System.out.println("\r                                                                                          ");
            System.out.println("=======     Menu Principal    =======");
            System.out.println("| Opciones:                         |");
            System.out.println("-------------------------------------");
            System.out.println("| 1. Piramide                       |");
            System.out.println("-------------------------------------");
            System.out.println("| 2. Clave                          |");
            System.out.println("-------------------------------------");
            System.out.println("| 3. Juego de Piedra, Papel o Tijera|");
            System.out.println("-------------------------------------");
            System.out.println("| 4. Adivinar                       |");
            System.out.println("-------------------------------------");
            System.out.println("| 5. Salir                          |");
            System.out.println("=====================================");
            System.out.println("\r                                                      ");
            System.out.println("Bienvenido al Menu Principal, ingrese una de las opciones para continuar: ");
            Opcion = scanner.nextInt();
            
            switch(Opcion) {
                case 1:
                    //Parte de Piramide de numeros impares
                    System.out.print("Cantidad de fila de piramide: ");
                    int CantidadFila = scanner.nextInt();
                    
                    int Numero = 1;
                    
                    for (int i = 1; i <= CantidadFila; i++) {
                        int Suma = 0;
                        
                        for (int j = 1; j <= i; j++) {
                            System.out.print(Numero + " ");
                            Suma += Numero;
                            Numero += 2;
                        }
                        
                        System.out.println("= " + Suma);
                    }
                    
                    break;
                    
                case 2:
                    //Parte de Clave (es el cifrado de atbash woooooooooooooooooooooooooooooooooooooooooooooooooooooooooo)
                    
                    //Parte para Cifrar
                    System.out.println("Ingrese una palabra o frase para cifrar: ");
                    String Frase = scanner.next();

                    FraseCifrada = "";

                    for (int i = 0; i < Frase.length(); i++) {
                        char Caracter = Frase.charAt(i);

                        if (Caracter >= 'a' && Caracter <= 'z') {
                            FraseCifrada += (char) ('z' - (Caracter - 'a'));
                        } else if (Caracter >= 'A' && Caracter <= 'Z') {
                            FraseCifrada += (char) ('Z' - (Caracter - 'A'));
                        } else {
                            FraseCifrada += Caracter;
                        }
                    }
                    System.out.println("La frase cifrada es: " + FraseCifrada);


                    //Parte para Descifrar palabra/frase ya cifrada
                    
                    System.out.println("Quiere descifrar su frase?");
                    String sino = scanner.next().toLowerCase();
                    
                    boolean DescifrarValido = false;
                    
                    if (sino.equals("si") || sino.equals("s")) {
                        DescifrarValido = true;
                        
                        FraseDescifrada = "";

                        for (int i = 0; i < FraseCifrada.length(); i++) {
                            char Caracter = FraseCifrada.charAt(i);

                            if (Caracter >= 'a' && Caracter <= 'z') {
                                FraseDescifrada += (char) ('z' - (Caracter - 'a'));
                            } else if (Caracter >= 'A' && Caracter <= 'Z') {
                                FraseDescifrada += (char) ('Z' - (Caracter - 'A'));
                            } else {
                                FraseDescifrada += Caracter;
                            }
                        }

                        System.out.println("La frase descifrada es: " + FraseDescifrada);
                    } else {
                        System.out.println("Ha decidido no descifrar la frase.");
                    }
                    
                    break;
                
                case 3:
                    //Parte del juego de piedra, papel, o tijera
                    
                    System.out.println("Bienvenido al juego de Piedra, Papel o Tijera!");
                    
                    boolean JugarOtravez = true;
                    
                    while(JugarOtravez) {
                        String TurnoUsuario = "";
                        boolean EntradaValidada = false;
                        
                        while(!EntradaValidada) {
                            System.out.println("Ingrese su opcion! (piedra, papel, o tijera): ");
                            TurnoUsuario = scanner.next().toLowerCase();
                            
                            if (TurnoUsuario.equals("piedra") || TurnoUsuario.equals("papel") || TurnoUsuario.equals("tijera")) {
                                EntradaValidada = true;
                            } else {
                                System.out.println("Eso no es permitido. Vuelva a ingresar una de las 3 opciones: ");
                            }
                            
                            int Computadora = random.nextInt(3);
                            String TurnoComputadora = "";
                            
                            if (Computadora == 0) {
                                TurnoComputadora = "piedra";
                            } else if (Computadora == 1) {
                                TurnoComputadora = "papel";
                            } else {
                                TurnoComputadora = "tijera";
                            }
                            
                            System.out.println("La eleccion de la computadora fue: " + TurnoComputadora);
                            
                            if (TurnoUsuario.equals(TurnoComputadora)) {
                                System.out.println("Ha habido un empate!");
                            } else if (
                                    (TurnoUsuario.equals("piedra") && TurnoComputadora.equals("tijera")) ||
                                    (TurnoUsuario.equals("papel") && TurnoComputadora.equals("piedra")) ||
                                    (TurnoUsuario.equals("tijera") && TurnoComputadora.equals("papel"))
                                    ) {
                                System.out.println("Has ganado!!");
                            } else {
                                System.out.println("La computadora ha ganado!");
                            } 
                            
                            System.out.println("Quieres seguir jugando?");
                            String nosi = scanner.next().toLowerCase();
                            
                            if (nosi.equals("no") || nosi.equals("n")) {
                                JugarOtravez = false;
                                System.out.println("Muchas gracias por antender este juego! esperamos que vuelva a jugar pronto!");
                            }
                        }
                    }
                    
                    break;
                    
                case 4:
                    //Parte de Adivinar
                    int NumeroSecreto = random.nextInt(100) + 1;
                    int Intentos = 0;
                    int Limite = 10;
                    int NumeroAdivinado = 0;
                    boolean NumeroAcertado = false;
                    
                    System.out.println("Bienvenido al juego de Adivinanza!");
                    System.out.println("Tiene " + Limite + " para adivinar el numero secreto entre 1 y 100!");
                    
                    while(Intentos < Limite) {
                        Intentos++;
                        System.out.println("Intento # " + Intentos + ", ingresa tu numero:");
                        int Adivinado = scanner.nextInt();
                        
                        if (Adivinado == NumeroSecreto) {
                            NumeroAdivinado = Adivinado;
                            NumeroAcertado = true;
                            System.out.println("Haz acertado el numero secreto!");
                            System.out.println("Lo acertaste en " + Intentos + " intentos!");
                            break;
                        } else if (Adivinado > NumeroSecreto) {
                            System.out.println("El numero que usted ingreso es MAYOR al numero secreto!");
                        } else {
                            System.out.println("El numero que usted ingreso es MENOR al numero secreto!");
                        }
                        
                        System.out.println("Te quedan " + (Limite - Intentos) + " intentos!");
                    }
                    
                    if (!NumeroAcertado) {
                        System.out.println("\r                                                                                  ");
                            System.out.println("No pudo encontrar el numero secreto dentro de los intentos dados.");
                            System.out.println("El numero era: " + NumeroSecreto);
                    }
                    
                    System.out.println("Fin del Juego");
                    break;
                    
                case 5:
                    System.out.println("Saliendo del Sistema...");
                    break;
                default:
                    System.out.println("Eso no es permitido, por favor vuelva a ingresar una opcion valida");
                    break;
            }
        } while (Opcion != 5);
    }
}
