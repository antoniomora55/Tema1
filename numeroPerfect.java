/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosunidad1;

import java.util.Scanner;

/**
 *
 * @author CXO Dell
 */
public class numeroPerfect {
    public boolean NumPerfecto(int n){

         int suma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        n = sc.nextInt();
        for (int i = 1; i < n; i++) {  // i son los divisores. Se divide desde 1 hasta n-1                            
            if (n % i == 0) {
                suma = suma + i;   // si es divisor se suma
            }
        }
        if (suma == n) {           // si el numero es igual a la suma de sus divisores es perfecto                
            System.out.println("El numero "+n+" es un numero perfecto");
        } else {
            System.out.println("El numero "+n+" no es un numero perfecto");

        }
        return false;
    
}}

