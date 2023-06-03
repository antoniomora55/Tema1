package metodosunidad1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MetodosUnidad1 { 

    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
  //metodo 1
  multRusa objMetodos=new multRusa();
  objMetodos.Parametros(37, 12);
 //metodo 2
  ClienteAgua objMetodo=new ClienteAgua();
  objMetodo.agua();
  //metodo 3
    numeroPerfect obj =new numeroPerfect();
    obj.NumPerfecto(0);
    //metodo 4
    FilaNumeros objMet=new FilaNumeros();
      objMet.NFilasDeNumeroNaturalesEnteros(0);
      //metodo5
      ConvertirNum obbj=new ConvertirNum();
      obbj.ConvertirNum();
      //metodo 6
        ContadorDeDigitos objContador=new ContadorDeDigitos();
int numero=Integer.valueOf(JOptionPane.showInputDialog(null, "Digite el número a evaluar"));
int resultado= objContador.contadorDigitos(numero);
JOptionPane.showMessageDialog(null, "El numero de digitos del numero "+numero+" es "+resultado);
    //Metodo 7
    NumPrimo objj=new NumPrimo();
    objj.esPrimo(numero);
    //Metodo 8
    NumMayor o=new NumMayor();
    o.mayorNum(numero, numero, numero);
    }
}
