/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosunidad1;

/**
 *
 * @author CXO Dell
 */
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
