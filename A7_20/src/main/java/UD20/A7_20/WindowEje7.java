package UD20.A7_20;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class WindowEje7 extends JPanel {
	private final double tasa_change = 166.386;
	private double changeCash = tasa_change;
	private JTextField quantity;
	private JTextField finalProduct;

	public WindowEje7() {
		add(new JLabel("Cantidad a convertir"));
		quantity = new JTextField("0.0", 6);
		add(quantity);
		add(new JLabel("Resultado"));
		finalProduct = new JTextField("0.0", 6);
		finalProduct.setEditable(false);
		add(finalProduct);

		JToggleButton coin = new JToggleButton("Euros a pesetas", false);
		add(coin);
		coin.addActionListener(new ButtonCListener());
		JButton change = new JButton("Transformar");
		add(change);
		change.addActionListener(new ChangeListener());
	}
	

	class ChangeListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			double cash = Double.parseDouble(quantity.getText());
			cash = cash * changeCash;
			String cadena = String.format("%6.2f", cash);
			finalProduct.setText(cadena);
		}

	}
	class ButtonCListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JToggleButton buttonCha = (JToggleButton) e.getSource();
			if (buttonCha.isSelected()) {
				buttonCha.setText("Pesetas a Euros");
				changeCash = 1 / tasa_change;
			} else {
				buttonCha.setText("Euros a pesetas");
				changeCash = tasa_change;
			}
		}

	}

	
}