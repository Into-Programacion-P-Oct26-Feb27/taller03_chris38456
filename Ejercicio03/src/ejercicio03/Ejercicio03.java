/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int var1 = 25;
        int var2 = 15;
        int var3 = 8;
        int var4 = 49;
        int var5 = 2.5;
        
        System.out.println("-------Solución a problema------------------");
        // Math.sqrt me permite obtener la raíz cuadrada de un número
        
        double resultado = (var1 + var2 / var3) + 
                Math.sqrt(var4) + var5;
        
        
        System.out.println(resultado);   
    }
    
}
