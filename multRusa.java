/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosunidad1;

/**
 *
 * @author CXO Dell
 */
public class multRusa {
     public int Parametros(int multiplicador, int multiplicando){
    int producto=0;
    while(multiplicador!=0){
        if(multiplicador % 2 != 0){
            producto = producto + multiplicando;
        }
        multiplicador = multiplicador / 2;
        multiplicando = multiplicando * 2;
    } System.out.println("El producto es: "+producto);
    return producto;
}}
