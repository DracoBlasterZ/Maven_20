package UD20.A3_20;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WindowEj3 extends JFrame {

	private JPanel contentPane;
	private int i=0;
	private int z=0;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public WindowEj3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Boton 1: 0 veces  Boton 2: 0 veces");
		lblNewLabel.setBounds(76, 11, 274, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Boton 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lblNewLabel.setText("Boton 1: "+i+" veces  Boton 2: "+z+" veces");
			}
		});
		btnNewButton.setBounds(59, 44, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Boton 2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				z++;
				lblNewLabel.setText("Boton 1: "+i+" veces  Boton 2: "+z+" veces");
			}
		});
		btnNewButton_1.setBounds(284, 44, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
