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
        System.out.print("Ingrese la cantidad total de alumnos en la clase: ");
        int CantidadAlumnos = scanner.nextInt();
        
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
        
        int Dia = Integer.parseInt(Fecha[0]);
        int Mes = Integer.parseInt(Fecha[1]);
        
        if (Dia < 1 || Dia > 31 || Mes < 1 || Mes > 12) {
            System.out.println("Error: día o mes fuera de rango.");
            return;
        }
        
        if (DiaSemana.equals("lunes") || DiaSemana.equals("martes") || DiaSemana.equals("miercoles")) {
            System.out.print("Ingrese la cantidad de alumnos aprobados: ");
            int Alumnos_aprobados = scanner.nextInt();
            
            if (Alumnos_aprobados > CantidadAlumnos) {
                System.out.println("Error. La cantidad de alumnos aprobados no puede ser mayor a la cantidad total de alumnos.");
                return;
            }
            
            int Alumnos_reprobados = CantidadAlumnos - Alumnos_aprobados;
            double PorcentajeAprobados = (double) Alumnos_aprobados / CantidadAlumnos * 100;
            
            System.out.println("**** Resumen del Dia ****");
            System.out.println("Fecha valida: " + DiaSemana.substring(0, 1).toUpperCase() + DiaSemana.substring(1) + ", Dia: " + Dia + ", Mes: " + Mes);
            System.out.println("Cantidad total de alumnos: " + CantidadAlumnos);
            System.out.println("Cantidad de alumnos aprobados: " + Alumnos_aprobados);
            System.out.println("Porcenaje de alumnos aprobados: %.2f%%\n" + PorcentajeAprobados);
            System.out.println("Cantidad de alumnos reprobados: " + Alumnos_reprobados);
            
        } else if (DiaSemana.equals("jueves")) {
            System.out.println("Ingrese el porcentaje de asistencia: ");
            double Porcentaje_asistencia = scanner.nextDouble();
            
            if (Porcentaje_asistencia > 50) {
                System.out.println("La mayoria ha asistido.");
            } else {
                System.out.println("La mayoria no ha asistido.");
            }
            
            System.out.println("**** Resumen del Dia ****");
            System.out.println("Fecha valida: " + DiaSemana.substring(0, 1).toUpperCase() + DiaSemana.substring(1) + ", Dia: " + Dia + ", Mes: " + Mes);
            System.out.println("Cantidad total de alumnos: " + CantidadAlumnos);
            System.out.println("Porcentaje de asistencia: " + Porcentaje_asistencia);
            
        } else if (DiaSemana.equals("viernes") && (Dia == 1 && Mes == 1 || Mes == 7)) {
            System.out.println("Comienzo de nuevo ciclo");
            System.out.println("Ingrese la cantidad de alumnos del nuevo ciclo");
            int Alumnos_nuevociclo = scanner.nextInt();
            System.out.println("Ingrese el precio en dolares($) por cada alumno del nuevo ciclo");
            double Precio_alumnosNC = scanner.nextDouble();
            double Ingreso = Alumnos_nuevociclo * Precio_alumnosNC;
            System.out.printf("Ingreso total: " + Ingreso);
            
            System.out.println("**** Resumen del Dia ****");
            System.out.println("Fecha valida: " + DiaSemana.substring(0, 1).toUpperCase() + DiaSemana.substring(1) + ", Dia: " + Dia + ", Mes: " + Mes);
            System.out.println("Cantidad total de alumnos: " + CantidadAlumnos);
            System.out.println("Cantidad de alumnos del nuevo ciclo: " + Alumnos_nuevociclo);
            System.out.printf("Ingreso total: $ " + Ingreso);
            
        } else {
            System.out.println("No se realiza nada en ese dia.");
        }
       
    }
}
