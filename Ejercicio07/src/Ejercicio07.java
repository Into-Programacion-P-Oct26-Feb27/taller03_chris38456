/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Paso 1: Declarar las variables de la primera parte (15 + 25 > 30)
    int var1 = 15;
    int var2 = 25;
    int suma = var1 + var2;
    int limite1 = 30;
    boolean parte1 = (suma > limite1); 
    
    // Paso 2: Declarar las variables de la segunda parte (64,0 < 60)
    double var3 = 8;
    double var4 = 2;
    double potencia = Math.pow(var3, var4); 
    double limite2 = 60;
    boolean parte2 = (potencia < limite2);
    
    // Paso 3: Declarar las variables de la tercera parte (raíz de 144 == 12)
    double var5 = 144;
    double raiz = Math.sqrt(var5); 
    double comparador = 12;
    boolean parte3 = (raiz == comparador);
    
    System.out.println("-------Solución a problema------------------");
    
    boolean resultadoFinal = parte1 || (parte2 && parte3);
    
    System.out.println("45 > 30, o 64,0 < 60 y 12 = 12");
    System.out.println(resultadoFinal);   
    }
    
}
