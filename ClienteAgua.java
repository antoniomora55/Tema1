/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosunidad1;

import javax.swing.JOptionPane;

/**
 *
 * @author CXO Dell
 */
public class ClienteAgua {
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
}
