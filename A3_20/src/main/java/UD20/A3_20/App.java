package UD20.A3_20;

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
					WindowEj3 frame = new WindowEj3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
