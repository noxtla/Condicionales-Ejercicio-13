/*Determinar si un numero es multiplo de 10*/

package Condicionales;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	 int saldo = 1000, operacion, dinero;
		
		
		do {
			operacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion "
																	+ "\n 1 Agregar "
																	+ "\n 2 Retirar "
																	+ "\n 3 Ver saldo"
																	+ "\n5 Salir"));

			if (operacion == 1) {
				dinero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad a depositar"));
				saldo += dinero;
				JOptionPane.showMessageDialog(null, "Su saldo es " + saldo);
			}
			
			if (operacion == 2) {
				dinero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad a retirar"));
				saldo -= dinero;
				JOptionPane.showMessageDialog(null, "Su saldo es " + saldo);
			}
			
			if (operacion == 3) {
				JOptionPane.showMessageDialog(null, "Su saldo es " + saldo);
			}
			
			
			
		}
		while (operacion != 5);
	}
}
