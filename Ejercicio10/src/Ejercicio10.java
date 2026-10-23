/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // --- 1. DECLARACIÓN DE VARIABLES NUMÉRICAS ---
    // Bloque 1 (Izquierdo)
    double var1 = 4;
    double var2 = 3;
    double var3 = 81;
    int limite1 = 70;
    int var4 = 50;
    int var5 = 2;
    int comparador1 = 25;

    // Bloque 2 (Derecho)
    int var6 = 18;
    int var7 = 12;
    int limite2 = 25;
    double var8 = 7;
    double var9 = 2;
    int limite3 = 40;

    // --- 2. DESGLOSE PASO A PASO ---

    // Condición 1: (4³ + √81 > 70)
    int potencia1 = (int) Math.pow(var1, var2);           
    int raiz1 = (int) Math.sqrt(var3);                     
    int total1 = potencia1 + raiz1;                        
    boolean parte1 = (total1 > limite1);                   

    // Condición 2: (50 / 2 == 25)
    int division1 = var4 / var5;                           
    boolean parte2 = (division1 == comparador1);           

    // Condición 3: (18 + 12 <= 25)
    int suma1 = var6 + var7;                               
    boolean parte3 = (suma1 <= limite2);                   

    // Condición 4: not(7² > 40)
    int potencia2 = (int) Math.pow(var8, var9);           
    boolean evaluacionInterna = (potencia2 > limite3);     
    boolean parte4 = !evaluacionInterna;                   

    // --- 3. EVALUACIÓN DE LOS BLOQUES PRINCIPALES ---
    
    boolean bloqueIzquierdo = parte1 && parte2;            
    boolean bloqueDerecho = parte3 && parte4;              

    // --- 4. RESULTADO FINAL ---
    
    boolean resultadoFinal = bloqueIzquierdo || bloqueDerecho; 

    // Mostrar los resultados en consola
    System.out.println("-------Solución a problema------------------");
    System.out.println("Bloque Izquierdo [ " + total1 + " > " + limite1 + " Y " + division1 + " == " + comparador1 + " ]: " + bloqueIzquierdo);
    System.out.println("Bloque Derecho [ " + suma1 + " <= " + limite2 + " Y NOT(" + potencia2 + " > " + limite3 + ") ]: " + bloqueDerecho);
    System.out.println("Resultado Final (Bloque Izquierdo OR Bloque Derecho): " + resultadoFinal);
    }    
}
