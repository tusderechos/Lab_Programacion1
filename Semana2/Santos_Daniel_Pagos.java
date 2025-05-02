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
        /*  
        informacion de categoria:
        categoria 1: $40 por hora extra
        categoria 2: $50 por hora extra
        categoria 3: $85 por hora extra
        categoria 4: $0
        */
        
        System.out.println("Ingrese el nombre completo del empleado: ");
        String NombreEmpleado = scanner.next();
        System.out.println("Ingrese el codigo del empleado: ");
        int CodigoEmpleado = scanner.nextInt();
        System.out.println("Ingrese la cantidad de horas trabajadas: ");
        int HorasTrabajadas = scanner.nextInt();
        System.out.println("Ingrese su categoria correspondiente (1, 2, 3, 4): ");
        int Categoria = scanner.nextInt();
        
        if (HorasTrabajadas <= 0) {
            System.out.println("Esa cantidad de horas no es permitida, por favor vuelva a ingresar sus horas trabajadas.");
            return;
        }
        
        
        double PagoHora = 35.99;
        int HorasExtra = 0;
        double PagoExtra = 0;
        double SalarioExtra = 0;
        
        if (HorasTrabajadas > 40) {
            HorasExtra = Math.min(40, 15);
        }
        
        
        switch (Categoria) {
            case 1:
                System.out.println("Categoria 1: $40 por hora extra");
            case 2:
                
            case 3:
                
            case 4:
                
        }
    }
    
}
