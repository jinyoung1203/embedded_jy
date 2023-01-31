package ex5_window_listener;

import java.awt.event.WindowEvent;

public class ClosingListener extends ListenerClass{
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("X¹öÆ° Å¬¸¯µÊ");
		System.exit(0);
	}
	
	
	
}
