package UD20.A2_20;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WindowEje2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public WindowEje2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JLabel lblNewLabel = new JLabel("Presiona un boton");
		lblNewLabel.setBounds(24, 28, 171, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Boton 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				lblNewLabel.setText("Has pulsado el boton 1");
			}
		});
		btnNewButton.setBounds(205, 24, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Boton 2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				lblNewLabel.setText("Has pulsado el boton 2");
			}
		});
		btnNewButton_1.setBounds(316, 24, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
