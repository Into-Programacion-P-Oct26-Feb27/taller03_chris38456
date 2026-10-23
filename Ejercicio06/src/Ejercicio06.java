/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        int var1 = 100;
        int var2 = 4;
        int division = var1 / var2; 
        boolean parte1 = (division == 25); 
    
   
        int var3 = 7;
        int var4 = 2;
        double potencia = Math.pow(var3,var4);
        boolean parte2 = (potencia > 50);
    
        System.out.println("-------Solución a problema------------------");
    
        boolean resultadoFinal = parte1 && parte2; 
    
        System.out.println("25 == 25 y 49 > 50");
        System.out.println(resultadoFinal);   
    }
    
}
