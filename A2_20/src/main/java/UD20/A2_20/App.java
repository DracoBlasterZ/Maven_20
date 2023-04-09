package UD20.A2_20;

import java.awt.EventQueue;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowEje2 frame = new WindowEje2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
