/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

/**
 *
 * @author reroes
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Resolución del problema
        int var1 = 5;
        int var2 = 2;
        int var3 = 3;
        int var4 = 3;
        int var5 = 4;
        int var6 = 7;
        
        System.out.println("-------Solución a problema------------------");
        // Math.sqrt me permite obtener la raíz cuadrada de un número
        
        double resultado = (Math.pow(var1, var2) + (Math.pow(var3, var4 ))) / 
                var5 + var6;
        
        
        System.out.println(resultado);        
    }
    
    
    
    
}
