/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import java.util.Scanner;

/**
 *
 * @author Junior Aguilar
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables x, y, z
        String x;
        String y;
        String z;
        double m;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la variable x: ");
        x = entrada.nextLine();
        
        System.out.println("Ingrese la variable y: ");
        y = entrada.nextLine();
        
        System.out.println("Ingrese la variable z: ");
        z = entrada.nextLine();
        
        double x1 = Double.parseDouble(x);
        double y1 = Double.parseDouble(y);
        double z1 = Double.parseDouble(z);
        
        m = (x1+(y1/z1))/(x1-(y1/z1));
        
        System.out.printf("El valor de m, en base a las variables:\nx = %s"
                + "\n\ty = %s\n\t\tz = %s\nda como resultado:\n\t\t\t"
                + "m = %.2f\n", x, y, z, m);
        
        
        
        
    }
    
}
