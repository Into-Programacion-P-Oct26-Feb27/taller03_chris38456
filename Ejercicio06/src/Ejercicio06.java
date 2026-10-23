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
    int comparador1 = 25;
    
    int base = 7;
    int exponente = 2;
    int comparador2 = 50;
    
    System.out.println("-------Solución a problema------------------");
    
    
    boolean resultado = ((var1 / var2) == comparador1) && (Math.pow(base, exponente) > comparador2);
    
 
    System.out.println(resultado);   
    }
    
}
