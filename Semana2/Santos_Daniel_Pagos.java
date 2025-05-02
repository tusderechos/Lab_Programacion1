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

public class Santos_Daniel_Pagos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el codigo del empleado: ");
        int Codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el nombre completo del empleado: ");
        String NombreEmpleado = scanner.next();
        System.out.println("Ingrese la cantidad de horas trabajadas: ");
        int HorasTrabajadas = scanner.nextInt();
        scanner.nextLine();
        
        if (HorasTrabajadas <= 0) {
            System.out.println("Esa cantidad de horas no es permitida, por favor vuelva a ingresar sus horas trabajadas.");
            return;
        }
        
        System.out.println("Ingrese su categoria correspondiente (1, 2, 3, 4): ");
        int Categoria = scanner.nextInt();
        scanner.nextLine();
            
                
        double PagoHora = 35.99;
        int HorasExtra = 0;
        double SalarioExtra = 0;
        
        if (HorasTrabajadas > 40) {
            HorasExtra = Math.min(40, 15);
        }
        
        switch (Categoria) {
            case 1:
                System.out.println("Categoria 1: $40 por hora extra");
                SalarioExtra = HorasExtra * 40;
            case 2:
                System.out.println("Categoria 2: $50 por hora extra");
                SalarioExtra = HorasExtra * 50;
            case 3:
                System.out.println("Categoria 3: $85 por hora extra");
                SalarioExtra = HorasExtra * 85;
            case 4:
                System.out.println("Categoria 4: $0 por hora extra");
                SalarioExtra = 0;
            default: 
                System.out.println("Categoria no valida. Ingrese una categoria valida.");
        }
        
        double Salario = 40 * PagoHora; 
        double SalarioTotal = Salario + SalarioExtra;
        
        
//        Salida de Pantalla
        System.out.println("**** Detalles de Trabajador ****");
        System.out.println("Nombre completo del trabajador: " + NombreEmpleado);
        System.out.println("Codigo del empleado: " + Codigo);
        System.out.println("Horas Trabajadas: " + HorasTrabajadas + " Horas");
        System.out.println("Categoria: " + Categoria);
        System.out.println("Salario Base por horas trabajadas: " + Salario);
        System.out.println("Horas extra trabajadas: " + HorasExtra + " Horas");
        System.out.println("Pago por horas extras: " + SalarioExtra);
        System.out.println("Total a pagar: $ " + SalarioTotal);
    }
    
}
