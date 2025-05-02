/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_Programacion1.Semana1;

/**
 *
 * @author Hp
 */

import java.util.Scanner;

public class Santos_Daniel_Cuotas {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
       System.out.print("Ingrese el monto del prestamo: \n");
       double MontoPrestamo = scanner.nextDouble();
       
       System.out.print("Ingrese la tasa de interes mensual como un porcentaje(sin signo de porcentaje): \n");
       double TasaInteres = scanner.nextDouble();
       
       System.out.print("Ingrese el tiempo del prestamo en meses: \n");
       int TiempoPrestamo = scanner.nextInt();
       
       System.out.print("Ingrese la comision por cuota: \n");
       double Comision = scanner.nextDouble();
       
       System.out.print("Ingrese el porcentaje en seguro mensual como porcentaje: \n");
       double SeguroMensual = scanner.nextDouble();
       
       TasaInteres = TasaInteres / 100;
       SeguroMensual = SeguroMensual / 100;
       
       double Cuota_base = (MontoPrestamo + (MontoPrestamo * TasaInteres * TiempoPrestamo)) / TiempoPrestamo;
       double Cuota_final = Cuota_base + Comision + (Cuota_base * SeguroMensual);
       
       double PagoMensual = Cuota_final * TiempoPrestamo;
       
       System.out.println("**** CUOTAS MENSUALES ****");
       System.out.println("Cuota de Pago Mensual: HNL " + Cuota_final);
       System.out.println("Total a Pagar: HNL " + PagoMensual);
       
       scanner.close();
    }
}
