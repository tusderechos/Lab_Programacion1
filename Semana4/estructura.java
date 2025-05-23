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

public class estructura {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        lea.useDelimiter("\n");
        
        //Inicializador opcion
        int Opcion;
        
        do {            
            System.out.println("-----------------------------");
            System.out.println("|       Menu Principal      |");
            System.out.println("-----------------------------");
            System.out.println("|Opciones disponibles:      |");
            System.out.println("| 1. Cifrado Cesar          |");
            System.out.println("| 2. Filtrado de Palabras   |");
            System.out.println("| 3. Codigo Enigma          |");
            System.out.println("-----------------------------");
            System.out.println("\r                                                                          ");
            System.out.print("Bienvenido al menu principal, ingrese una opcion para poder hacer: ");
            Opcion = lea.nextInt();
            System.out.println("\r                                                                          ");
            
            switch(Opcion) {
                case 1:
                    //Parte de Cifrado Cesar
                    
        
        
                    //Recursos de referencia
                    String abecedarioUp= "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
                    String abecedarioLow= "abcdefghijklmnñopqrstuvwxyz";
        
                    //String que almacena el texto cifrado
                    String texto_cifrado=" ";
        
       
                    //Ingreso de frase inicial
                    System.out.println("Ingrese una frase: ");
                    String frase=lea.next();


                    //Ingreso de indice de salto
                    System.out.println("Ingrese el indice de salto: ");
                    int indexSalto= lea.nextInt();

                    int fraselength=frase.length();

                    //Ciclo recorredor de frase
                    int k;
                    for(k=0; k<=(fraselength-1); k++){
                        char letra=frase.charAt(k);

                        //Letra en mayuscula para poder comparar con abecedario de referencia
                        char letraUP= Character.toUpperCase(letra);

                        //Variable que referencia la posicion en el abecedario
                        int pos= abecedarioUp.indexOf(letraUP);

                        //pos==-1 en caso que no coincida con ninguna de las letras del abecedario
                        if(pos==-1){
                            texto_cifrado+=letra;
                        }else{
                            //Pruebas ifs para comprobar si la letra es mayuscula o minuscula
                            if(letra==letraUP){
                                texto_cifrado+=abecedarioUp.charAt((pos+indexSalto)%27);
                            }else{
                                texto_cifrado+=abecedarioLow.charAt((pos+indexSalto)%27);
                            }

                        }

                    }//fin for
                    System.out.println("Texto Cifrado: "+texto_cifrado);
                    break;
                    
                    
                    
                    
                    
                case 2:
                    //Parte de Filtrado de Palabras
                    System.out.println("Ingrese una frase: ");
                    String Frase = lea.next();
                    
                    System.out.println("Ingrese un limite de caracteres: ");
                    int Limite = lea.nextInt();
                    
                    if (Limite < 0) {
                        System.out.println("El limite de caracteres tiene que ser mayor a 0, ingrese un limite mayor a 0");
                        break;
                    }
                    
                    Frase = Frase + " "; //aqui solo se le suma un espacio a la frase para que se lea bien la ultima palabra
                    int Inicio = 0; //inicio de la frase
                    int Longitud = Frase.length();
                    
                    System.out.println("Lista de Palabras: ");
                    for (int i = 0; i < Longitud; i++) {
                        if (Frase.charAt(i) == ' ') {
                            String Palabra = Frase.substring(Inicio, i);
                            String Palabralimpia = Palabra.replaceAll("\\p{Punct}", "");
                            System.out.println(" " + Palabralimpia);
                            Inicio = i + 1;
                        }
                    }
                    
                    //for para recorrer la frase una y otra vez para encontrar palabras que sean mayores al limite ingresado
                    System.out.println("Palabras con caracteres mayor al limite: " + Limite);
                    Inicio = 0;
                    
                    for (int i = 0; i < Longitud; i++) {
                        if (Frase.charAt(i) == ' ') {
                            String Palabra = Frase.substring(Inicio, i);
                            String Palabralimpia = Palabra.replaceAll("\\p{Punct}", ""); //aqui se elimina cualquier pleca, coma, punto, signo de pregunta/exlamacion 
                            if (Palabralimpia.length() >= Limite) {
                                System.out.println(" " + Palabralimpia);
                            }
                            Inicio = i + 1;
                        }
                    }
                    
                    break;
                    
                case 3:
                    
                     //Seccion codigo enigma
                    
                    //Inicializador de variables y contadores
                    String mitadpar="";
                    String mitadimpar="";
                    int lengthImpar=0;
                    int lengthPar=0;
                    boolean continuar=false;

                    while(continuar!=true){
                      System.out.println("***Menu de Opciones***");
                      System.out.println("1.Encriptar texto"+"\n2.Desencriptar texto"+"\n3.Regresar");

                      int opcion=lea.nextInt();

                      switch(opcion){

                         case 1:
                           //Ingreso de la parte de encriptar
                          System.out.println("Ingrese el texto que desea encriptar: ");
                          String texto=lea.next();

                          int textolength=texto.length();


                         //Contadores de posiciones
                         int poseven;
                         int posodd;



                         //Ciclo para mitad en posiciones pares
                          for(poseven=0; poseven<=(textolength-1); poseven+=2){
                             char letra= texto.charAt(poseven);
                             if(letra==' '){
                                 //No ocurre nada
                             }else{
                                 mitadpar+=letra;
                                 lengthPar++;
                             }

                          }

                         
                          //Ciclo para mitad en posiciones impares
                          for(posodd=1; posodd<=(textolength-1); posodd+=2){
                              char letra= texto.charAt(posodd);
                              if(letra==' '){
                                  //No ocurre nada
                              }else{
                                 mitadimpar+=letra; 
                                 lengthImpar++;
                              }

                          }
                          
                          //Creacion del texto codificado
                          String texto_enigma=mitadpar+mitadimpar;

                          System.out.println("El texto codificado es: "+texto_enigma);
                          break;

                       case 2:
                           //Seccion que se ocupa de desencriptar el mensaje anterior
                          int j;
                        
                          //String de mensaje decodificado
                          String mensajedecoded=" ";

                          
                          //Saca longitud maxima para poder evaluar la distancia de la palabra a reconstruir
                          int longitudmaxima= Math.max(mitadpar.length(), mitadimpar.length());
                          
                          for(j=0; j<longitudmaxima; j++){
                              
                              if(j<mitadpar.length()){
                                  mensajedecoded+=mitadpar.charAt(j);
                              }
                              
                              if(j<mitadimpar.length()){
                                  mensajedecoded+=mitadimpar.charAt(j);
                              }

                          }
                          System.out.println("Palabra decodificada: " +mensajedecoded);
                           System.out.println("");
                          
                          //Reinicio de variables
                          mitadpar="";
                          mitadimpar="";
                          lengthImpar=0;
                          lengthPar=0;

                          break;

                       case 3:
                           //Sale del la seccion encriptar
                           System.out.println("");
                           continuar=true;
                          break;

                      }


                    }
                    
                    break;
                    
                default:
                    //Verificador de ingreso de opcion
                    System.out.println("Esa opcion no es valida, por favor ingrese una opcion que sea valida.");
                    break;
            }
                
        } while (Opcion != 3);
    }
}
