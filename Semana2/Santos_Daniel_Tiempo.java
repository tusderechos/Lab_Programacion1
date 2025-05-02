package Lab_Programacion1.Semana2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp
 */

import java.util.Scanner;

public class Santos_Daniel_Tiempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese una cantidad de segundos porfavor");
        int Segundos = scanner.nextInt();   
        
        String resultado = (Segundos <= 0) ? "No se permite eso" : "";
        
        if (resultado.isEmpty()) {
            int Horas = Segundos / 3600;
            Segundos = Segundos % 3600;
            
            int Minutos = Segundos / 60;
            Segundos = Segundos % 60;
            
            resultado = "Hora(s): " + Horas + " Minuto(s): " + Minutos + " Segundo(s): " + Segundos;
        }
        
        System.out.println(resultado);
    }
}
