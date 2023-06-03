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
public class FilaNumeros {
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
}
