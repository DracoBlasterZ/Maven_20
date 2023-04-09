package UD20.A6_20;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

	public class WindowEje6 extends JFrame {
	
	private JTextField heightCam;
	private JTextField weightCam;
	private JTextField IMCCam;
	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */

	
	public WindowEje6() {
	JLabel heithetiquete = new JLabel("Altura[metros]");
	JLabel weightetiquete = new JLabel("Peso[kg]");
	JLabel IMCEtiquete = new JLabel("IMC");
	JButton solve = new JButton("solve IMC");
	heightCam = new JTextField(6);
	weightCam = new JTextField(6);
	IMCCam = new JTextField(6);
	IMCCam.setEditable(false);
	JPanel panel = new JPanel();
	
	panel.add(heithetiquete);
	panel.add(heightCam);
	panel.add(weightetiquete);
	panel.add(weightCam);
	panel.add(solve);
	panel.add(IMCEtiquete);
	panel.add(IMCCam);
	add(panel);

		solve.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
			Double peso = Double.parseDouble(weightCam.getText());
			Double altura = Double.parseDouble(heightCam.getText());
			Double imc = peso / (altura * altura);
			// DAMOS FORMATO AL RESULTADO
			String resultado = String.format("%6.2f", imc);
			IMCCam.setText(resultado);
			
			}
		});
	
	}
}