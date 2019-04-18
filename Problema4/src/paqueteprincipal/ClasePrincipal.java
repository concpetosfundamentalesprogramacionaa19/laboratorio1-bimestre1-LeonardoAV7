/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteprincipal;
import paquete1.MiClase1;
import paquete2.MiClase2;
import paquete3.MiClase3;
/**
 *
 * @author Junior Aguilar
 */
public class ClasePrincipal {
    
    
    public static void main(String[] args) {
        
        String mayor = MiClase1.edad >=18 ? "y mayor de edad" : "y menos de"
                + " edad";
        
        System.out.printf("Nombre: \n\t%s \nApellido: \n\t%s \nEdad: \n\t%d\n"
                + "%s", MiClase2.nombre, MiClase3.apellido, MiClase1.edad
                , mayor);
        
        
    }
}
