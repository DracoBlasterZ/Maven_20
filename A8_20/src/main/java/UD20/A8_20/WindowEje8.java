package UD20.A8_20;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class WindowEje8 extends JPanel {
	private final double tasa_change = 166.386;
	private double changeCash = tasa_change;
	private JTextField quantity;
	private JTextField finalProduct;

	public WindowEje8() {
		add(new JLabel("Cantidad a convertir"));
		quantity = new JTextField("0.0", 6);
		add(quantity);
		add(new JLabel("Resultado"));
		finalProduct = new JTextField("0.0", 6);
		finalProduct.setEditable(false);
		add(finalProduct);

		JToggleButton coin = new JToggleButton("Euros a pesetas", false);

		coin.setMnemonic(KeyEvent.VK_E);
		add(coin);
		coin.addActionListener(new ButtonCListener());
		JButton change = new JButton("Cambiar");
		change.setMnemonic(KeyEvent.VK_C);
		;
		add(change);
		change.addActionListener(new ChangeListener());
		JButton errarse = new JButton("errarse");
		errarse.setMnemonic(KeyEvent.VK_B);
		add(errarse);

		errarse.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				errarseDatos();
			}
		});

	}

	private void errarseDatos() {
		quantity.setText("0.0");
		finalProduct.setText("0.0");

	}


	class ChangeListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			double cash = 0.0;

			try {
				cash = Double.parseDouble(quantity.getText());
			} catch (NumberFormatException ex) {

				JOptionPane.showMessageDialog(WindowEje8.this, "Solo se pueden introducir digitos y el punto decimal",
						"Error en el formato numérico", JOptionPane.ERROR_MESSAGE);
				errarseDatos();
			}
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
				buttonCha.setText("Ptas a Euros");
				changeCash = 1 / tasa_change;
			} else {
				buttonCha.setText("Euros a ptas");
				changeCash = tasa_change;
			}
		}

	}
}