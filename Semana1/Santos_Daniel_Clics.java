/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_Programacion1.Semana1;

/**
 *
 * @author Hp
 */
public class Santos_Daniel_Clics {
    public static void main(String[] args) {
        int clic1 = 60;
        int clic2 = 100;
        int clic3 = 20;
        double ISV = 1.16;
        
        double costo_clic1 = clic1 * 0.30;
        double costo_clic2 = clic2 * 0.25;
        double costo_clic3 = clic3 * 0.80;
        int clic_total = clic1 + clic2 + clic3;
        double costo_total = costo_clic1 + costo_clic2 + costo_clic3;
        double costo_promedio = costo_total / clic_total;
        double total = costo_total * ISV;
        
        String total_format = String.format("%.2f", total);
        
        System.out.println("Su costo total con el ISV es: " + total_format);
    }
}
