/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // 1. Declarar las variables numéricas de la nueva expresión
    double var1 = 225;
    double var2 = 5;
    double var3 = 2;
    int limite1 = 50;
    
    int var4 = 120;
    int var5 = 4;
    int comparador = 30;

    // --- DESGLOSE PASO A PASO ---

    // Paso 2: Resolver la primera parte (√225 + 5² < 50)
    int raizParte1 = (int) Math.sqrt(var1);               
    int potenciaParte1 = (int) Math.pow(var2, var3);      
    int totalParte1 = raizParte1 + potenciaParte1;        
    boolean parte1 = (totalParte1 < limite1);             

    // Paso 3: Resolver la segunda parte (120 / 4 == 30)
    int divisionParte2 = var4 / var5;                     
    boolean parte2 = (divisionParte2 == comparador);      

    System.out.println("-------Solución a problema------------------");

    // Paso 4: Evaluar la condición interna (AND) y luego aplicar el NOT general (!)
    boolean condicionInterna = parte1 && parte2;          
    boolean resultadoFinal = !condicionInterna;           

    // Mostrar los resultados en consola
    System.out.println("¿Es NOT [ (" + totalParte1 + " < " + limite1 + ") Y (" + divisionParte2 + " == " + comparador + ") ]?");
    System.out.println("Resultado: " + resultadoFinal);
    }    
}
