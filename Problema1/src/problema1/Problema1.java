/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import java.util.Scanner;

/**
 *
 * @author Junior Aguilar
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Numero de horas trabajadas
        int horas;
        // Costo hora oficial
        double costo;
        // Valor mensual a pagar
        double total;
        // Descuento al seguro Social
        double descuento;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el costo hora oficial: ");
        costo = entrada.nextDouble();
        
        System.out.println("Ingrese el numero de horas trabajadas: ");
        horas = entrada.nextInt();
        
        total = costo*horas;
        descuento = total*0.1;
        
        
        System.out.printf("El valor mensual a pagar es: %.2f\nEl valor de su "
                + "descuento al Seguro Social es: %.2f\n", total, descuento);
        
        
        
        
    }
    
}
