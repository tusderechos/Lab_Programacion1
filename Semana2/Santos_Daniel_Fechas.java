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

public class Santos_Daniel_Fechas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese su primera fecha en el formato DD/MM/YYYY");
        String Fecha1 = scanner.next();
        System.out.println("Ingrese su segunda fecha en el formato DD/MM/YYYY");
        String Fecha2 = scanner.next();
        
        
        
        int Dia1 = Integer.parseInt(Fecha1.substring(0,2));
        int Mes1 = Integer.parseInt(Fecha1.substring(3,5));
        int Año1 = Integer.parseInt(Fecha1.substring(7,9));
        
        int Dia2 = Integer.parseInt(Fecha2.substring(0,2));
        int Mes2 = Integer.parseInt(Fecha2.substring(3,5));
        int Año2 = Integer.parseInt(Fecha2.substring(7,9));
        
        int DiasTotal1 = (Año1 * 360) + (Mes1 * 30) + Dia1;
        int DiasTotal2 = (Año2 * 360) + (Mes2 * 30) + Dia2;
        
        
        int DiferenciaDias = Math.abs(DiasTotal1 - DiasTotal2);
        
        
        System.out.println("La cantidad de dias entre sus dos fechas es de: " + DiferenciaDias + " dias");
    }
}
