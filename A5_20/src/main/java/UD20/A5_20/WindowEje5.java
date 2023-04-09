package UD20.A5_20;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.event.MouseInputAdapter;

public class WindowEje5 extends JFrame {

	private JTextArea textArea;

	public WindowEje5() {
		textArea = new JTextArea(15, 60);
		JPanel panel = new JPanel();
		JButton buttonCle = new JButton("Clear");
		panel.add(buttonCle);
		panel.add(textArea);
		add(panel);
		ActionListener oyentebuttonCle = new ListenerAction();
		buttonCle.addActionListener(oyentebuttonCle);
		MouseListener MouseListener = new MouseListener();
		textArea.addMouseListener(MouseListener);

	}
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */

	class MouseListener extends MouseInputAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
		textArea.append("Has hecho clic en \n");
		textArea.append("Posicion X: " + e.getX());
		textArea.append("Posicion Y: " + e.getY());
		
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			
		if (((e.getModifiers() & InputEvent.BUTTON3_MASK) != 0)) {
		textArea.append("Pulsado el botón derecho \n");
		}
		
		textArea.append("Se ha pulsado el botón del ratón \n");
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
		textArea.append("Se ha soltado el botón del ratón \n");
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
		textArea.append("El ratón ha entrado en el componente \n");
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
		textArea.append("El ratón ha salido del componente \n");
		}
		
	}
	class ListenerAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		textArea.setText("");

		}
	}
}
	
