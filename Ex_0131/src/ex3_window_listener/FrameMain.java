package ex3_window_listener;

import java.awt.Frame;

public class FrameMain {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		//f.setSize(100,400);
		//f.setLocation(300, 300);
		f.setBounds(300, 300, 500, 400);//������ �� ��ǥ�� ���Ը޼���
		
		//�����ӿ��� ���� ��ư Ŭ���� �����ϴ� �̺�Ʈ �����ڸ� ����
		f.addWindowListener( new MyListener() );
		
		
		f.setVisible(true);
		
		
		
		
	}//main
}
