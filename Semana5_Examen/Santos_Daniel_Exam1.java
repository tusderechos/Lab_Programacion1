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
            //El menu principal en todo su esplendor
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
            
            //Aqui inician los cases
            switch(Opcion) {
                case 1:
                    //Parte de Piramide de numeros impares
                    System.out.print("Cantidad de fila de piramide: ");
                    int CantidadFila = scanner.nextInt();
                    
                    int Numero = 1; //Para empezar las filas en 1 especificamente
                    
                    //for para repetir la generacion de filas hasta llegar al numero de filas que ingreso el usuario
                    for (int i = 1; i <= CantidadFila; i++) {
                        int Suma = 0; //Creacion de variable suma para que al momento se ir a otra fila siempre sea una impar 
                        
                        //Otro for pero este ya se encarga de generar la fila y de hacer la suma para poder tener filas impares
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

                    FraseCifrada = ""; //Para poder reemplazar despues de tener la palabra/frase la cifrada

                    //for que repite i hasta llegar a la longitud de la palabra/frase
                    for (int i = 0; i < Frase.length(); i++) {
                        char Caracter = Frase.charAt(i); //Aqui creo un char para poder saber cuando caracteres tiene la palabra/frase

                        //if que ya hace el acto de cifrar 
                        if (Caracter >= 'a' && Caracter <= 'z') {
                            FraseCifrada += (char) ('z' - (Caracter - 'a'));
                        } else if (Caracter >= 'A' && Caracter <= 'Z') {
                            FraseCifrada += (char) ('Z' - (Caracter - 'A'));
                        } else {
                            FraseCifrada += Caracter; //Al momento de ya cifrar la palabra se reemplaza el vacio que tiene el String de la frase cifrada con el char de Caracter
                        }
                    }
                    System.out.println("La frase cifrada es: " + FraseCifrada);


                    //Parte para Descifrar palabra/frase ya cifrada
                    
                    System.out.println("Quiere descifrar su frase?"); //Porque uno nunca puede estar seguro de sus acciones se le pregunta si esta seguro
                    String sino = scanner.next().toLowerCase();
                    
                    boolean DescifrarValido = false; //boolean para poder proseguir si el usuario decide descifrar su palabra/frase
                    
                    //if que ya toma en cuenta la respuesta del usuario y prosigue con el codigo si dice si, y vuelve al menu si dice no
                    if (sino.equals("si") || sino.equals("s")) {
                        DescifrarValido = true;
                        
                        FraseDescifrada = ""; //Para poder reemplazar con la palabra/frase ya descifrada despues

                        //for que hace exactamente lo mismo que se uso para descifrar
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
                    
                    boolean JugarOtravez = true; //boolean para cuando el usuario sea preguntado si quiere jugar otra vez
                    
                    //while para repetir el proceso si el usuario dice que si quiere jugar otra vez
                    while(JugarOtravez) {
                        String TurnoUsuario = ""; //Para reemplazar despues
                        boolean EntradaValidada = false;
                        
                        while(!EntradaValidada) {
                            System.out.println("Ingrese su opcion! (piedra, papel, o tijera): ");
                            TurnoUsuario = scanner.next().toLowerCase(); //Aqui ya se reemplaza, pero si se creaba la variable aqui, no se iba a leer en otras partes
                            
                            //if para asegurar que el usuario no haya puesto algo ademas que piedra, papel o tijera
                            if (TurnoUsuario.equals("piedra") || TurnoUsuario.equals("papel") || TurnoUsuario.equals("tijera")) {
                                EntradaValidada = true;
                            } else {
                                System.out.println("Eso no es permitido. Vuelva a ingresar una de las 3 opciones: ");
                            }
                            
                            int Computadora = random.nextInt(3); //Aqui ya se hace mencion del Random, para poder generar la respuesta de la computadora
                            String TurnoComputadora = ""; //Para reemplazar despues 
                            
                            //if para poder saber cual es la respuesta de la computadora
                            if (Computadora == 0) {
                                TurnoComputadora = "piedra";
                            } else if (Computadora == 1) {
                                TurnoComputadora = "papel";
                            } else {
                                TurnoComputadora = "tijera";
                            }
                            
                            System.out.println("La eleccion de la computadora fue: " + TurnoComputadora);
                            
                            //ifelse para decidir la respuesta del juego, por si es empate, si el usuario gana o s la computadora gana
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
                            
                            //Aqui ya se le pide al usuario si quiere jugar otra vez
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
                    int NumeroSecreto = random.nextInt(100) + 1; //Se genera un numero aleatorio del 1 al 100 y el + 1 sirve para que empieze un 1 
                    int Intentos = 0; //Numero de intentos del usuario
                    int Limite = 10; //Limite de intentos
                    int NumeroAdivinado = 0; //Aqui se reemplaza despues el numero adivinado del usuario
                    boolean NumeroAcertado = false; //boolean para poder confirmar que el numero haya sido acertado
                    
                    System.out.println("Bienvenido al juego de Adivinanza!");
                    System.out.println("Tiene " + Limite + " para adivinar el numero secreto entre 1 y 100!");
                    
                    while(Intentos < Limite) {
                        Intentos++; //Se van sumando los intentos hasta llegar a 10
                        System.out.println("Intento # " + Intentos + ", ingresa tu numero:");
                        int Adivinado = scanner.nextInt();
                        
                        if (Adivinado == NumeroSecreto) { //if para ver si el usuario acerto el numero secreto
                            NumeroAdivinado = Adivinado; //Se reemplaza su numero con el int vacio que teniamos arriba
                            NumeroAcertado = true; //Se confirma que haya sido acertado
                            System.out.println("Haz acertado el numero secreto!");
                            System.out.println("Lo acertaste en " + Intentos + " intentos!");
                            break;
                        } else if (Adivinado > NumeroSecreto) { //ifelse para poder decirle al usuario que su numero es mayor o menos que el numero secerto
                            System.out.println("El numero que usted ingreso es MAYOR al numero secreto!");
                        } else {
                            System.out.println("El numero que usted ingreso es MENOR al numero secreto!");
                        }
                        
                        System.out.println("Te quedan " + (Limite - Intentos) + " intentos!"); //Mostrar intentos restantes
                    }
                    
                    //if por si no acierta el numero secreto
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
