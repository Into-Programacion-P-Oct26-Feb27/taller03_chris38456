/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;

/**
 *
 * @author su-usuario-github
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solución a la problemática

        int variable1 = 18;
        int variable2 = 6;
        int variable3 = 3;
        int variable4 = 4;
        int variable5 = 64;

        System.out.println("-------Solución a problema------------------");
        // Math.sqrt me permite obtener la raíz cuadrada de un número
        
        double resultado = (variable1 + variable2 * variable3) / 
                variable4 + Math.sqrt(variable5);
        
        
        
        System.out.println(resultado);

    }

}
