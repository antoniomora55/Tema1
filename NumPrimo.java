/*;
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosunidad1;

/**
 *
 * @author CXO Dell
 */
public class NumPrimo {
   public void esPrimo(int numero) {
       boolean primo=false;
       for(int i=2; i<numero; i++){
           if(numero%2==0) primo=false;
           else primo=true;
           if(primo)System.out.println("Es un numero primo");
           else System.out.println("No es un numero primo");
       }
           
   }
}
