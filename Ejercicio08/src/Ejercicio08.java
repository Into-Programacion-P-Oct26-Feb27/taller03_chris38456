/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Variables definidas por ti (corregidos los puntos y coma)
    int var1 = 80;
    int var2 = 40;
    int var3 = 6;
    int var4 = 5;
    int var5 = 2;
    int var6 = 45;
    int var7 = 100;
    int var8 = 25;
    int var9 = 3;
    int var10 = 30;

    // Paso 1: Declarar las variables de la primera parte ((80 + 40) / 6 + 5^2 >= 45)
    int sumaParte1 = var1 + var2;                          
    int divisionParte1 = sumaParte1 / var3;                
    int potenciaParte1 = (int) Math.pow(var4, var5);      
    int totalParte1 = divisionParte1 + potenciaParte1;     
    boolean parte1 = (totalParte1 >= var6);                

    // Paso 2: Declarar las variables de la segunda parte (100 - 25 * 3 < 30)
    int multiplicacionParte2 = var8 * var9;                
    int totalParte2 = var7 - multiplicacionParte2;         
    boolean parte2 = (totalParte2 < var10);                

    System.out.println("-------Solución a problema------------------");

    // Paso 3: Evaluar la expresión final con el operador AND (&&) que pide la imagen
    boolean resultadoFinal = parte1 && parte2;             

    // Mostrar resultados dinámicos en pantalla
    System.out.println("Is (" + totalParte1 + " >= " + var6 + ") and (" + totalParte2 + " < " + var10 + ")?");
    System.out.println("Resultado: " + resultadoFinal);
    } 
}
