package UD20.A6_20;

import java.awt.EventQueue;


public class App 
{
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowEje6 frame = new WindowEje6();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
}
