/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_Programacion1.Semana2;

/**
 *
 * @author Hp
 */

import java.util.Scanner;

public class Santos_Daniel_Clases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        
        System.out.print("Ingrese la fecha de hoy en el formato (ej: lunes, 05/04): ");
        String FechaHoy = scanner.next();
        
        String[] division = FechaHoy.split (", ");  
        
        if (division.length != 2) {
            System.out.println("Error. ese no es el formato indicado.");
            return;
        }
        
        String DiaSemana = division[0].toLowerCase();
        String[] Fecha = division[1].split("/");
        
        if (Fecha.length != 2) {
            System.out.println("Error: formato de fecha incorrecto.");
            return;
        }

        // Convertir el día y el mes a enteros
        int Dia = Integer.parseInt(Fecha[0]);
        int Mes = Integer.parseInt(Fecha[1]);
        
        
        
        
        
//        Salida de Pantalla
        
        System.out.println("Fecha valida: " + DiaSemana.substring(0, 1).toUpperCase() + DiaSemana.substring(1) + ", Dia: " + Dia + ", Mes: " + Mes);
        
        
    }
}
