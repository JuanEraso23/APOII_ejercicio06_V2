package context;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Conversor de Monto");
        
        //Atributos
        String valorInput = JOptionPane.showInputDialog("Monto (Pesos Colombianos):");
        double valor = Double.parseDouble(valorInput);
        
        //Formula
        double dolar = valor / 19.5;
        
        //Resultado
        JOptionPane.showMessageDialog(null, "Monto (Dólares): " + dolar);
  }

}
