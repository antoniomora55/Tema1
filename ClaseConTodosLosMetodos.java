/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosunidad1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author CXO Dell
 */
public class ClaseConTodosLosMetodos {
     public int agua(){
                String clientName = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
      int consumption = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el consumo en metros cúbicos:"));
      int rate = 0;
      if (consumption < 100) {
         rate = 40;
      } else if (consumption >= 100 && consumption < 500) {
         rate = 60;
      } else if (consumption >= 500 && consumption < 1000) {
         rate = 80;
      } else if (consumption >= 1000) {
         rate = 100;
      }
      int amountToPay =consumption;
      if (amountToPay > 600) {
         amountToPay = amountToPay + (amountToPay * 2 / 100);
      }else{
          amountToPay=rate;
      }
      JOptionPane.showMessageDialog(null, "Cliente: " + clientName + "\nMonto a pagar: $" + amountToPay);
        return 0;
   }
     public class ContadorDeDigitos {
    int dividir,contarDigitos,resultado;
    public void conta(){
    dividir=10;contarDigitos=0;resultado=0;

        
    }
    public int contadorDigitos(int num){
      do{
          resultado=num/dividir;
          contarDigitos++;
          dividir=dividir*10;
      }while(resultado>=1); 
        return contarDigitos;
        
    }
}
     public void ConvertirNum() {
          int numero, exp, digito;
        double binario;
        Scanner sc = new Scanner(System.in);

        do{ 
            System.out.print("Introduce un numero: ");                                                
            numero = sc.nextInt();
        }while(numero < 0);

        exp=0;
        binario=0;
        while(numero!=0){
                digito = numero % 2;           
                binario = binario + digito * Math.pow(10, exp);                                                   
                exp++;
                numero = numero/2;
        }
        System.out.printf("Binario: %.0f %n", binario);
    }
      public int NFilasDeNumeroNaturalesEnteros(int n){
Scanner teclado = new Scanner(System.in);



for(int i=1;i<=n;i++){
System.out.println();
for(int y=0;y<=((i-1)+i);y++){
if(y%2==1){
System.out.print(y);
System.out.print(" ");
}
}
}
        return 0;
     
}
      public int mayorNum(int dato1, int dato2, int dato3){
        int a=Math.max(dato1, dato2);
        System.out.println("El mayor es "+(Math.max(a, dato3)));
        return a;
    }
      public void esPrimo(int numero) {
       boolean primo=false;
       for(int i=2; i<numero; i++){
           if(numero%2==0) primo=false;
           else primo=true;
           if(primo)System.out.println("Es un numero primo");
           else System.out.println("No es un numero primo");
       }
           
   }
         public int mulRusa(int multiplicador, int multiplicando){
    int producto=0;
    while(multiplicador!=0){
        if(multiplicador % 2 != 0){
            producto = producto + multiplicando;
        }
        multiplicador = multiplicador / 2;
        multiplicando = multiplicando * 2;
    } System.out.println("El producto es: "+producto);
    return producto;
}
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
    
}
}
