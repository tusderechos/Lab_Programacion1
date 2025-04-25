/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_Programacion1;

/**
 *
 * @author Hp
 */

import java.util.Scanner;

public class Santos_Daniel_PlantillaEmpleado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        scanner.useDelimiter("\n");
        
        System.out.print("Ingrese el nombre completo del empleado: \n");
        String NombreEmpleado = scanner.next();
        
        System.out.print("Ingrese el numero de horas trabajadas en el mes: \n");
        double HorasTrabajadas = scanner.nextDouble();
        
        System.out.print("Ingrese la tarifa por hora: \n");
        double Tarifa_hora = scanner.nextDouble();
        
        double Horas_semanal = (HorasTrabajadas / 4);
        double Salario_semanal = Horas_semanal * Tarifa_hora;
        
        
        
        
        System.out.println("------ Boleta del Empleado ------");
        System.out.println("Nombre del empleado: " + NombreEmpleado);
        System.out.println("Hora de trabajo mensual: " + HorasTrabajadas);
        System.out.println("Tarifa por hora: Lps. " + Tarifa_hora);
        System.out.println("Salario del Empleado Semanal: Lps. " + Salario_semanal);
        
        scanner.close();
    }
}
